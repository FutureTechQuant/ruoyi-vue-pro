package cn.iocoder.yudao.module.asset.controller.admin.useraccountsource.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 用户资产来源分页 Request VO")
@Data
public class UserAccountSourcePageReqVO extends PageParam {

    @Schema(description = "用户资产账户ID", example = "16221")
    private Long accountId;

    @Schema(description = "用户编号", example = "4490")
    private Long userId;

    @Schema(description = "资产定义ID", example = "4555")
    private Long assetId;

    @Schema(description = "来源类型：1订单购买 2活动赠送 3后台赠送 4退款回退 5补发", example = "1")
    private Integer sourceType;

    @Schema(description = "来源业务ID", example = "28669")
    private Long sourceId;

    @Schema(description = "来源业务明细ID", example = "23980")
    private Long sourceItemId;

    @Schema(description = "来源单号")
    private String sourceNo;

    @Schema(description = "订单ID", example = "28119")
    private Long orderId;

    @Schema(description = "订单项ID", example = "4651")
    private Long orderItemId;

    @Schema(description = "商品SPU ID", example = "26021")
    private Long spuId;

    @Schema(description = "商品SKU ID", example = "24064")
    private Long skuId;

    @Schema(description = "发放模式：1固定数量 2固定天数 3永久访问")
    private Integer grantMode;

    @Schema(description = "本来源发放数量")
    private Integer grantQuantity;

    @Schema(description = "本来源已使用数量")
    private Integer usedQuantity;

    @Schema(description = "本来源剩余数量")
    private Integer remainQuantity;

    @Schema(description = "本来源发放天数")
    private Integer grantDays;

    @Schema(description = "是否永久有效")
    private Boolean permanent;

    @Schema(description = "生效时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] effectiveTime;

    @Schema(description = "过期时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] expireTime;

    @Schema(description = "状态：1正常 2已用尽 3已退完 4已失效", example = "2")
    private Integer status;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createtime;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] updatetime;

    @Schema(description = "租户编号", example = "8628")
    private Long tenantid;

}