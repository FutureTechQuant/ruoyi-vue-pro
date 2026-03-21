package cn.iocoder.yudao.module.asset.controller.admin.skugrantrule.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - SKU资产发放规则分页 Request VO")
@Data
public class SkuGrantRulePageReqVO extends PageParam {

    @Schema(description = "商品SPU ID", example = "7931")
    private Long spuId;

    @Schema(description = "商品SKU ID", example = "15591")
    private Long skuId;

    @Schema(description = "资产定义ID", example = "22069")
    private Long assetId;

    @Schema(description = "资产编码快照")
    private String assetCodeSnapshot;

    @Schema(description = "资产名称快照")
    private String assetNameSnapshot;

    @Schema(description = "履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT", example = "1")
    private Integer fulfillmentType;

    @Schema(description = "单位类型快照：1次 2份 3天 4月 5席位", example = "2")
    private Integer unitType;

    @Schema(description = "发放模式：1固定数量 2固定天数 3永久访问")
    private Integer grantMode;

    @Schema(description = "发放数量；次数型/预约型使用")
    private Integer grantQuantity;

    @Schema(description = "发放天数；访问型使用")
    private Integer grantDays;

    @Schema(description = "是否永久有效")
    private Boolean permanent;

    @Schema(description = "生效延迟天数")
    private Integer effectiveDelayDays;

    @Schema(description = "过期规则：0跟随资产定义 1永久 2固定时间 3领取后N天", example = "1")
    private Integer expireRuleType;

    @Schema(description = "固定过期时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] fixedExpireTime;

    @Schema(description = "领取后有效天数")
    private Integer expireDays;

    @Schema(description = "排序")
    private Integer sort;

    @Schema(description = "状态：1启用 0停用", example = "1")
    private Integer status;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createtime;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] updatetime;

    @Schema(description = "租户编号", example = "20962")
    private Long tenantid;

}