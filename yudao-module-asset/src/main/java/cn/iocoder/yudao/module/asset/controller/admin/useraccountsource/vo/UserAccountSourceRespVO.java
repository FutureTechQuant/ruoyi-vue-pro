package cn.iocoder.yudao.module.asset.controller.admin.useraccountsource.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 用户资产来源 Response VO")
@Data
@ExcelIgnoreUnannotated
public class UserAccountSourceRespVO {

    @Schema(description = "用户资产来源编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "10707")
    @ExcelProperty("用户资产来源编号")
    private Long id;

    @Schema(description = "用户资产账户ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "16221")
    @ExcelProperty("用户资产账户ID")
    private Long accountId;

    @Schema(description = "用户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "4490")
    @ExcelProperty("用户编号")
    private Long userId;

    @Schema(description = "资产定义ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "4555")
    @ExcelProperty("资产定义ID")
    private Long assetId;

    @Schema(description = "来源类型：1订单购买 2活动赠送 3后台赠送 4退款回退 5补发", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("来源类型：1订单购买 2活动赠送 3后台赠送 4退款回退 5补发")
    private Integer sourceType;

    @Schema(description = "来源业务ID", example = "28669")
    @ExcelProperty("来源业务ID")
    private Long sourceId;

    @Schema(description = "来源业务明细ID", example = "23980")
    @ExcelProperty("来源业务明细ID")
    private Long sourceItemId;

    @Schema(description = "来源单号")
    @ExcelProperty("来源单号")
    private String sourceNo;

    @Schema(description = "订单ID", example = "28119")
    @ExcelProperty("订单ID")
    private Long orderId;

    @Schema(description = "订单项ID", example = "4651")
    @ExcelProperty("订单项ID")
    private Long orderItemId;

    @Schema(description = "商品SPU ID", example = "26021")
    @ExcelProperty("商品SPU ID")
    private Long spuId;

    @Schema(description = "商品SKU ID", example = "24064")
    @ExcelProperty("商品SKU ID")
    private Long skuId;

    @Schema(description = "发放模式：1固定数量 2固定天数 3永久访问", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("发放模式：1固定数量 2固定天数 3永久访问")
    private Integer grantMode;

    @Schema(description = "本来源发放数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("本来源发放数量")
    private Integer grantQuantity;

    @Schema(description = "本来源已使用数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("本来源已使用数量")
    private Integer usedQuantity;

    @Schema(description = "本来源剩余数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("本来源剩余数量")
    private Integer remainQuantity;

    @Schema(description = "本来源发放天数", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("本来源发放天数")
    private Integer grantDays;

    @Schema(description = "是否永久有效", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("是否永久有效")
    private Boolean permanent;

    @Schema(description = "生效时间")
    @ExcelProperty("生效时间")
    private LocalDateTime effectiveTime;

    @Schema(description = "过期时间")
    @ExcelProperty("过期时间")
    private LocalDateTime expireTime;

    @Schema(description = "状态：1正常 2已用尽 3已退完 4已失效", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("状态：1正常 2已用尽 3已退完 4已失效")
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

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "8628")
    @ExcelProperty("租户编号")
    private Long tenantid;

}