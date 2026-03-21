package cn.iocoder.yudao.module.asset.controller.app.useraccount;

import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
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

@Tag(name = "用户 App - 用户资产账户")
@RestController
@RequestMapping("/asset/user-account")
@Validated
public class AppUserAccountController {

    @Resource
    private UserAccountService userAccountService;

    @PostMapping("/create")
    @Operation(summary = "创建用户资产账户")
    public CommonResult<Long> createUserAccount(@Valid @RequestBody UserAccountSaveReqVO createReqVO) {
        return success(userAccountService.createUserAccount(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新用户资产账户")
    public CommonResult<Boolean> updateUserAccount(@Valid @RequestBody UserAccountSaveReqVO updateReqVO) {
        userAccountService.updateUserAccount(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除用户资产账户")
    @Parameter(name = "id", description = "编号", required = true)
    public CommonResult<Boolean> deleteUserAccount(@RequestParam("id") Long id) {
        userAccountService.deleteUserAccount(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得用户资产账户")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    public CommonResult<UserAccountRespVO> getUserAccount(@RequestParam("id") Long id) {
        UserAccountDO userAccount = userAccountService.getUserAccount(id);
        return success(BeanUtils.toBean(userAccount, UserAccountRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得用户资产账户分页")
    public CommonResult<PageResult<UserAccountRespVO>> getUserAccountPage(@Valid UserAccountPageReqVO pageReqVO) {
        PageResult<UserAccountDO> pageResult = userAccountService.getUserAccountPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, UserAccountRespVO.class));
    }


}
