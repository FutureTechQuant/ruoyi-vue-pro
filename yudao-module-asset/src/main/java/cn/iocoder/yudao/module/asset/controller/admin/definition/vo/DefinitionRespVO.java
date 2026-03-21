package cn.iocoder.yudao.module.asset.controller.admin.definition.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 资产定义 Response VO")
@Data
@ExcelIgnoreUnannotated
public class DefinitionRespVO {

    @Schema(description = "资产定义编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1415")
    @ExcelProperty("资产定义编号")
    private Long id;

    @Schema(description = "资产编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("资产编码")
    private String code;

    @Schema(description = "资产名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "赵六")
    @ExcelProperty("资产名称")
    private String name;

    @Schema(description = "资产类型：1报告 2课程 3咨询 99其他", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("资产类型：1报告 2课程 3咨询 99其他")
    private Integer assetType;

    @Schema(description = "履约类型：1QUOTA次数型 2ACCESS访问型 3APPOINTMENT预约型", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("履约类型：1QUOTA次数型 2ACCESS访问型 3APPOINTMENT预约型")
    private Integer fulfillmentType;

    @Schema(description = "单位类型：1次 2份 3天 4月 5席位", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("单位类型：1次 2份 3天 4月 5席位")
    private Integer unitType;

    @Schema(description = "过期规则：1永久 2固定时间 3领取后N天", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("过期规则：1永久 2固定时间 3领取后N天")
    private Integer expireRuleType;

    @Schema(description = "固定过期时间")
    @ExcelProperty("固定过期时间")
    private LocalDateTime fixedExpireTime;

    @Schema(description = "领取后有效天数")
    @ExcelProperty("领取后有效天数")
    private Integer expireDays;

    @Schema(description = "是否支持退款回退", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("是否支持退款回退")
    private Boolean supportRefund;

    @Schema(description = "是否支持转移", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("是否支持转移")
    private Boolean supportTransfer;

    @Schema(description = "状态：1启用 0停用", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("状态：1启用 0停用")
    private Integer status;

    @Schema(description = "备注", example = "你说的对")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createtime;

    @Schema(description = "更新时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("更新时间")
    private LocalDateTime updatetime;

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "8824")
    @ExcelProperty("租户编号")
    private Long tenantid;

}