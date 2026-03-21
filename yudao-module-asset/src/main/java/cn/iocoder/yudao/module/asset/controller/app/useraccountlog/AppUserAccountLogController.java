package cn.iocoder.yudao.module.asset.controller.app.useraccountlog;

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

import cn.iocoder.yudao.module.asset.controller.admin.useraccountlog.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccountlog.UserAccountLogDO;
import cn.iocoder.yudao.module.asset.service.useraccountlog.UserAccountLogService;

@Tag(name = "用户 App - 用户资产账户流水")
@RestController
@RequestMapping("/asset/user-account-log")
@Validated
public class AppUserAccountLogController {

    @Resource
    private UserAccountLogService userAccountLogService;

    @PostMapping("/create")
    @Operation(summary = "创建用户资产账户流水")
    public CommonResult<Long> createUserAccountLog(@Valid @RequestBody UserAccountLogSaveReqVO createReqVO) {
        return success(userAccountLogService.createUserAccountLog(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新用户资产账户流水")
    public CommonResult<Boolean> updateUserAccountLog(@Valid @RequestBody UserAccountLogSaveReqVO updateReqVO) {
        userAccountLogService.updateUserAccountLog(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除用户资产账户流水")
    @Parameter(name = "id", description = "编号", required = true)
    public CommonResult<Boolean> deleteUserAccountLog(@RequestParam("id") Long id) {
        userAccountLogService.deleteUserAccountLog(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得用户资产账户流水")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    public CommonResult<UserAccountLogRespVO> getUserAccountLog(@RequestParam("id") Long id) {
        UserAccountLogDO userAccountLog = userAccountLogService.getUserAccountLog(id);
        return success(BeanUtils.toBean(userAccountLog, UserAccountLogRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得用户资产账户流水分页")
    public CommonResult<PageResult<UserAccountLogRespVO>> getUserAccountLogPage(@Valid UserAccountLogPageReqVO pageReqVO) {
        PageResult<UserAccountLogDO> pageResult = userAccountLogService.getUserAccountLogPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, UserAccountLogRespVO.class));
    }


}
