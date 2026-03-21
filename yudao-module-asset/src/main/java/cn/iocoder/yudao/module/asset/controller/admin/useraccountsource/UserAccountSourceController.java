package cn.iocoder.yudao.module.asset.controller.admin.useraccountsource;

import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import jakarta.validation.constraints.*;
import jakarta.validation.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.io.IOException;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.*;

import cn.iocoder.yudao.module.asset.controller.admin.useraccountsource.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccountsource.UserAccountSourceDO;
import cn.iocoder.yudao.module.asset.service.useraccountsource.UserAccountSourceService;

@Tag(name = "管理后台 - 用户资产来源")
@RestController
@RequestMapping("/asset/user-account-source")
@Validated
public class UserAccountSourceController {

    @Resource
    private UserAccountSourceService userAccountSourceService;

    @PostMapping("/create")
    @Operation(summary = "创建用户资产来源")
    @PreAuthorize("@ss.hasPermission('asset:user-account-source:create')")
    public CommonResult<Long> createUserAccountSource(@Valid @RequestBody UserAccountSourceSaveReqVO createReqVO) {
        return success(userAccountSourceService.createUserAccountSource(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新用户资产来源")
    @PreAuthorize("@ss.hasPermission('asset:user-account-source:update')")
    public CommonResult<Boolean> updateUserAccountSource(@Valid @RequestBody UserAccountSourceSaveReqVO updateReqVO) {
        userAccountSourceService.updateUserAccountSource(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除用户资产来源")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('asset:user-account-source:delete')")
    public CommonResult<Boolean> deleteUserAccountSource(@RequestParam("id") Long id) {
        userAccountSourceService.deleteUserAccountSource(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除用户资产来源")
                @PreAuthorize("@ss.hasPermission('asset:user-account-source:delete')")
    public CommonResult<Boolean> deleteUserAccountSourceList(@RequestParam("ids") List<Long> ids) {
        userAccountSourceService.deleteUserAccountSourceListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得用户资产来源")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('asset:user-account-source:query')")
    public CommonResult<UserAccountSourceRespVO> getUserAccountSource(@RequestParam("id") Long id) {
        UserAccountSourceDO userAccountSource = userAccountSourceService.getUserAccountSource(id);
        return success(BeanUtils.toBean(userAccountSource, UserAccountSourceRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得用户资产来源分页")
    @PreAuthorize("@ss.hasPermission('asset:user-account-source:query')")
    public CommonResult<PageResult<UserAccountSourceRespVO>> getUserAccountSourcePage(@Valid UserAccountSourcePageReqVO pageReqVO) {
        PageResult<UserAccountSourceDO> pageResult = userAccountSourceService.getUserAccountSourcePage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, UserAccountSourceRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出用户资产来源 Excel")
    @PreAuthorize("@ss.hasPermission('asset:user-account-source:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportUserAccountSourceExcel(@Valid UserAccountSourcePageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<UserAccountSourceDO> list = userAccountSourceService.getUserAccountSourcePage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "用户资产来源.xls", "数据", UserAccountSourceRespVO.class,
                        BeanUtils.toBean(list, UserAccountSourceRespVO.class));
    }

}