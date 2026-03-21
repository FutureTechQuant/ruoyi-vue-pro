package cn.iocoder.yudao.module.asset.controller.app.usagerecord;

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

import cn.iocoder.yudao.module.asset.controller.admin.usagerecord.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.usagerecord.UsageRecordDO;
import cn.iocoder.yudao.module.asset.service.usagerecord.UsageRecordService;

@Tag(name = "用户 App - 资产使用记录")
@RestController
@RequestMapping("/asset/usage-record")
@Validated
public class AppUsageRecordController {

    @Resource
    private UsageRecordService usageRecordService;

    @PostMapping("/create")
    @Operation(summary = "创建资产使用记录")
    public CommonResult<Long> createUsageRecord(@Valid @RequestBody UsageRecordSaveReqVO createReqVO) {
        return success(usageRecordService.createUsageRecord(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新资产使用记录")
    public CommonResult<Boolean> updateUsageRecord(@Valid @RequestBody UsageRecordSaveReqVO updateReqVO) {
        usageRecordService.updateUsageRecord(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除资产使用记录")
    @Parameter(name = "id", description = "编号", required = true)
    public CommonResult<Boolean> deleteUsageRecord(@RequestParam("id") Long id) {
        usageRecordService.deleteUsageRecord(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得资产使用记录")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    public CommonResult<UsageRecordRespVO> getUsageRecord(@RequestParam("id") Long id) {
        UsageRecordDO usageRecord = usageRecordService.getUsageRecord(id);
        return success(BeanUtils.toBean(usageRecord, UsageRecordRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得资产使用记录分页")
    public CommonResult<PageResult<UsageRecordRespVO>> getUsageRecordPage(@Valid UsageRecordPageReqVO pageReqVO) {
        PageResult<UsageRecordDO> pageResult = usageRecordService.getUsageRecordPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, UsageRecordRespVO.class));
    }


}
