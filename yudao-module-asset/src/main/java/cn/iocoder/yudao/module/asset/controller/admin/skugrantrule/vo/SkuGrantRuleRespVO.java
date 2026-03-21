package cn.iocoder.yudao.module.asset.controller.admin.skugrantrule.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - SKU资产发放规则 Response VO")
@Data
@ExcelIgnoreUnannotated
public class SkuGrantRuleRespVO {

    @Schema(description = "SKU资产发放规则编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "26952")
    @ExcelProperty("SKU资产发放规则编号")
    private Long id;

    @Schema(description = "商品SPU ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "7931")
    @ExcelProperty("商品SPU ID")
    private Long spuId;

    @Schema(description = "商品SKU ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "15591")
    @ExcelProperty("商品SKU ID")
    private Long skuId;

    @Schema(description = "资产定义ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "22069")
    @ExcelProperty("资产定义ID")
    private Long assetId;

    @Schema(description = "资产编码快照", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("资产编码快照")
    private String assetCodeSnapshot;

    @Schema(description = "资产名称快照", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("资产名称快照")
    private String assetNameSnapshot;

    @Schema(description = "履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT")
    private Integer fulfillmentType;

    @Schema(description = "单位类型快照：1次 2份 3天 4月 5席位", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("单位类型快照：1次 2份 3天 4月 5席位")
    private Integer unitType;

    @Schema(description = "发放模式：1固定数量 2固定天数 3永久访问", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("发放模式：1固定数量 2固定天数 3永久访问")
    private Integer grantMode;

    @Schema(description = "发放数量；次数型/预约型使用", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("发放数量；次数型/预约型使用")
    private Integer grantQuantity;

    @Schema(description = "发放天数；访问型使用", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("发放天数；访问型使用")
    private Integer grantDays;

    @Schema(description = "是否永久有效", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("是否永久有效")
    private Boolean permanent;

    @Schema(description = "生效延迟天数", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("生效延迟天数")
    private Integer effectiveDelayDays;

    @Schema(description = "过期规则：0跟随资产定义 1永久 2固定时间 3领取后N天", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("过期规则：0跟随资产定义 1永久 2固定时间 3领取后N天")
    private Integer expireRuleType;

    @Schema(description = "固定过期时间")
    @ExcelProperty("固定过期时间")
    private LocalDateTime fixedExpireTime;

    @Schema(description = "领取后有效天数")
    @ExcelProperty("领取后有效天数")
    private Integer expireDays;

    @Schema(description = "排序", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("排序")
    private Integer sort;

    @Schema(description = "状态：1启用 0停用", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
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

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "20962")
    @ExcelProperty("租户编号")
    private Long tenantid;

}