package cn.iocoder.yudao.module.asset.controller.admin.skugrantrule;

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

import cn.iocoder.yudao.module.asset.controller.admin.skugrantrule.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.skugrantrule.SkuGrantRuleDO;
import cn.iocoder.yudao.module.asset.service.skugrantrule.SkuGrantRuleService;

@Tag(name = "管理后台 - SKU资产发放规则")
@RestController
@RequestMapping("/asset/sku-grant-rule")
@Validated
public class SkuGrantRuleController {

    @Resource
    private SkuGrantRuleService skuGrantRuleService;

    @PostMapping("/create")
    @Operation(summary = "创建SKU资产发放规则")
    @PreAuthorize("@ss.hasPermission('asset:sku-grant-rule:create')")
    public CommonResult<Long> createSkuGrantRule(@Valid @RequestBody SkuGrantRuleSaveReqVO createReqVO) {
        return success(skuGrantRuleService.createSkuGrantRule(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新SKU资产发放规则")
    @PreAuthorize("@ss.hasPermission('asset:sku-grant-rule:update')")
    public CommonResult<Boolean> updateSkuGrantRule(@Valid @RequestBody SkuGrantRuleSaveReqVO updateReqVO) {
        skuGrantRuleService.updateSkuGrantRule(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除SKU资产发放规则")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('asset:sku-grant-rule:delete')")
    public CommonResult<Boolean> deleteSkuGrantRule(@RequestParam("id") Long id) {
        skuGrantRuleService.deleteSkuGrantRule(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除SKU资产发放规则")
                @PreAuthorize("@ss.hasPermission('asset:sku-grant-rule:delete')")
    public CommonResult<Boolean> deleteSkuGrantRuleList(@RequestParam("ids") List<Long> ids) {
        skuGrantRuleService.deleteSkuGrantRuleListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得SKU资产发放规则")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('asset:sku-grant-rule:query')")
    public CommonResult<SkuGrantRuleRespVO> getSkuGrantRule(@RequestParam("id") Long id) {
        SkuGrantRuleDO skuGrantRule = skuGrantRuleService.getSkuGrantRule(id);
        return success(BeanUtils.toBean(skuGrantRule, SkuGrantRuleRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得SKU资产发放规则分页")
    @PreAuthorize("@ss.hasPermission('asset:sku-grant-rule:query')")
    public CommonResult<PageResult<SkuGrantRuleRespVO>> getSkuGrantRulePage(@Valid SkuGrantRulePageReqVO pageReqVO) {
        PageResult<SkuGrantRuleDO> pageResult = skuGrantRuleService.getSkuGrantRulePage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, SkuGrantRuleRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出SKU资产发放规则 Excel")
    @PreAuthorize("@ss.hasPermission('asset:sku-grant-rule:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportSkuGrantRuleExcel(@Valid SkuGrantRulePageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<SkuGrantRuleDO> list = skuGrantRuleService.getSkuGrantRulePage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "SKU资产发放规则.xls", "数据", SkuGrantRuleRespVO.class,
                        BeanUtils.toBean(list, SkuGrantRuleRespVO.class));
    }

}