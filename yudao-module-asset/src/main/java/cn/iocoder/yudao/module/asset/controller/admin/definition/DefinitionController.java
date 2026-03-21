package cn.iocoder.yudao.module.asset.controller.admin.definition;

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

import cn.iocoder.yudao.module.asset.controller.admin.definition.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.definition.DefinitionDO;
import cn.iocoder.yudao.module.asset.service.definition.DefinitionService;

@Tag(name = "管理后台 - 资产定义")
@RestController
@RequestMapping("/asset/definition")
@Validated
public class DefinitionController {

    @Resource
    private DefinitionService definitionService;

    @PostMapping("/create")
    @Operation(summary = "创建资产定义")
    @PreAuthorize("@ss.hasPermission('asset:definition:create')")
    public CommonResult<Long> createDefinition(@Valid @RequestBody DefinitionSaveReqVO createReqVO) {
        return success(definitionService.createDefinition(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新资产定义")
    @PreAuthorize("@ss.hasPermission('asset:definition:update')")
    public CommonResult<Boolean> updateDefinition(@Valid @RequestBody DefinitionSaveReqVO updateReqVO) {
        definitionService.updateDefinition(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除资产定义")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('asset:definition:delete')")
    public CommonResult<Boolean> deleteDefinition(@RequestParam("id") Long id) {
        definitionService.deleteDefinition(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除资产定义")
                @PreAuthorize("@ss.hasPermission('asset:definition:delete')")
    public CommonResult<Boolean> deleteDefinitionList(@RequestParam("ids") List<Long> ids) {
        definitionService.deleteDefinitionListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得资产定义")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('asset:definition:query')")
    public CommonResult<DefinitionRespVO> getDefinition(@RequestParam("id") Long id) {
        DefinitionDO definition = definitionService.getDefinition(id);
        return success(BeanUtils.toBean(definition, DefinitionRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得资产定义分页")
    @PreAuthorize("@ss.hasPermission('asset:definition:query')")
    public CommonResult<PageResult<DefinitionRespVO>> getDefinitionPage(@Valid DefinitionPageReqVO pageReqVO) {
        PageResult<DefinitionDO> pageResult = definitionService.getDefinitionPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, DefinitionRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出资产定义 Excel")
    @PreAuthorize("@ss.hasPermission('asset:definition:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportDefinitionExcel(@Valid DefinitionPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<DefinitionDO> list = definitionService.getDefinitionPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "资产定义.xls", "数据", DefinitionRespVO.class,
                        BeanUtils.toBean(list, DefinitionRespVO.class));
    }

}