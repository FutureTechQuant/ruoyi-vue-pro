package cn.iocoder.yudao.module.asset.controller.admin.useraccount;

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

import cn.iocoder.yudao.module.asset.controller.admin.useraccount.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccount.UserAccountDO;
import cn.iocoder.yudao.module.asset.service.useraccount.UserAccountService;

@Tag(name = "管理后台 - 用户资产账户")
@RestController
@RequestMapping("/asset/user-account")
@Validated
public class UserAccountController {

    @Resource
    private UserAccountService userAccountService;

    @PostMapping("/create")
    @Operation(summary = "创建用户资产账户")
    @PreAuthorize("@ss.hasPermission('asset:user-account:create')")
    public CommonResult<Long> createUserAccount(@Valid @RequestBody UserAccountSaveReqVO createReqVO) {
        return success(userAccountService.createUserAccount(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新用户资产账户")
    @PreAuthorize("@ss.hasPermission('asset:user-account:update')")
    public CommonResult<Boolean> updateUserAccount(@Valid @RequestBody UserAccountSaveReqVO updateReqVO) {
        userAccountService.updateUserAccount(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除用户资产账户")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('asset:user-account:delete')")
    public CommonResult<Boolean> deleteUserAccount(@RequestParam("id") Long id) {
        userAccountService.deleteUserAccount(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除用户资产账户")
                @PreAuthorize("@ss.hasPermission('asset:user-account:delete')")
    public CommonResult<Boolean> deleteUserAccountList(@RequestParam("ids") List<Long> ids) {
        userAccountService.deleteUserAccountListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得用户资产账户")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('asset:user-account:query')")
    public CommonResult<UserAccountRespVO> getUserAccount(@RequestParam("id") Long id) {
        UserAccountDO userAccount = userAccountService.getUserAccount(id);
        return success(BeanUtils.toBean(userAccount, UserAccountRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得用户资产账户分页")
    @PreAuthorize("@ss.hasPermission('asset:user-account:query')")
    public CommonResult<PageResult<UserAccountRespVO>> getUserAccountPage(@Valid UserAccountPageReqVO pageReqVO) {
        PageResult<UserAccountDO> pageResult = userAccountService.getUserAccountPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, UserAccountRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出用户资产账户 Excel")
    @PreAuthorize("@ss.hasPermission('asset:user-account:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportUserAccountExcel(@Valid UserAccountPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<UserAccountDO> list = userAccountService.getUserAccountPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "用户资产账户.xls", "数据", UserAccountRespVO.class,
                        BeanUtils.toBean(list, UserAccountRespVO.class));
    }

}