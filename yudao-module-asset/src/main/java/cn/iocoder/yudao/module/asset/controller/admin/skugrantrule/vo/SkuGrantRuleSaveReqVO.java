package cn.iocoder.yudao.module.asset.controller.admin.skugrantrule.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - SKU资产发放规则新增/修改 Request VO")
@Data
public class SkuGrantRuleSaveReqVO {

    @Schema(description = "SKU资产发放规则编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "26952")
    private Long id;

    @Schema(description = "商品SPU ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "7931")
    @NotNull(message = "商品SPU ID不能为空")
    private Long spuId;

    @Schema(description = "商品SKU ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "15591")
    @NotNull(message = "商品SKU ID不能为空")
    private Long skuId;

    @Schema(description = "资产定义ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "22069")
    @NotNull(message = "资产定义ID不能为空")
    private Long assetId;

    @Schema(description = "资产编码快照", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "资产编码快照不能为空")
    private String assetCodeSnapshot;

    @Schema(description = "资产名称快照", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "资产名称快照不能为空")
    private String assetNameSnapshot;

    @Schema(description = "履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT不能为空")
    private Integer fulfillmentType;

    @Schema(description = "单位类型快照：1次 2份 3天 4月 5席位", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "单位类型快照：1次 2份 3天 4月 5席位不能为空")
    private Integer unitType;

    @Schema(description = "发放模式：1固定数量 2固定天数 3永久访问", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "发放模式：1固定数量 2固定天数 3永久访问不能为空")
    private Integer grantMode;

    @Schema(description = "发放数量；次数型/预约型使用", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "发放数量；次数型/预约型使用不能为空")
    private Integer grantQuantity;

    @Schema(description = "发放天数；访问型使用", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "发放天数；访问型使用不能为空")
    private Integer grantDays;

    @Schema(description = "是否永久有效", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "是否永久有效不能为空")
    private Boolean permanent;

    @Schema(description = "生效延迟天数", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "生效延迟天数不能为空")
    private Integer effectiveDelayDays;

    @Schema(description = "过期规则：0跟随资产定义 1永久 2固定时间 3领取后N天", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "过期规则：0跟随资产定义 1永久 2固定时间 3领取后N天不能为空")
    private Integer expireRuleType;

    @Schema(description = "固定过期时间")
    private LocalDateTime fixedExpireTime;

    @Schema(description = "领取后有效天数")
    private Integer expireDays;

    @Schema(description = "排序", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "排序不能为空")
    private Integer sort;

    @Schema(description = "状态：1启用 0停用", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "状态：1启用 0停用不能为空")
    private Integer status;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "创建时间不能为空")
    private LocalDateTime createtime;

    @Schema(description = "更新时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "更新时间不能为空")
    private LocalDateTime updatetime;

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "20962")
    @NotNull(message = "租户编号不能为空")
    private Long tenantid;

}