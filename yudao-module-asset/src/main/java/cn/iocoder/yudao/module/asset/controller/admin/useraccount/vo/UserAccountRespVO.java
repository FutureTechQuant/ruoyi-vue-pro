package cn.iocoder.yudao.module.asset.controller.admin.useraccount.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 用户资产账户 Response VO")
@Data
@ExcelIgnoreUnannotated
public class UserAccountRespVO {

    @Schema(description = "用户资产账户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "6900")
    @ExcelProperty("用户资产账户编号")
    private Long id;

    @Schema(description = "用户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "31145")
    @ExcelProperty("用户编号")
    private Long userId;

    @Schema(description = "资产定义ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "13227")
    @ExcelProperty("资产定义ID")
    private Long assetId;

    @Schema(description = "资产编码快照", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("资产编码快照")
    private String assetCodeSnapshot;

    @Schema(description = "资产名称快照", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("资产名称快照")
    private String assetNameSnapshot;

    @Schema(description = "资产类型快照：1报告 2课程 3咨询 99其他", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("资产类型快照：1报告 2课程 3咨询 99其他")
    private Integer assetType;

    @Schema(description = "履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT")
    private Integer fulfillmentType;

    @Schema(description = "单位类型快照：1次 2份 3天 4月 5席位", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("单位类型快照：1次 2份 3天 4月 5席位")
    private Integer unitType;

    @Schema(description = "累计发放数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("累计发放数量")
    private Integer totalQuantity;

    @Schema(description = "累计已使用数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("累计已使用数量")
    private Integer usedQuantity;

    @Schema(description = "累计退款回退数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("累计退款回退数量")
    private Integer refundQuantity;

    @Schema(description = "累计人工调整数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("累计人工调整数量")
    private Integer adjustQuantity;

    @Schema(description = "当前剩余数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("当前剩余数量")
    private Integer remainQuantity;

    @Schema(description = "冻结数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("冻结数量")
    private Integer freezeQuantity;

    @Schema(description = "状态：1正常 2冻结 3失效 4用尽", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("状态：1正常 2冻结 3失效 4用尽")
    private Integer status;

    @Schema(description = "生效时间")
    @ExcelProperty("生效时间")
    private LocalDateTime effectiveTime;

    @Schema(description = "过期时间")
    @ExcelProperty("过期时间")
    private LocalDateTime expireTime;

    @Schema(description = "最后发放时间")
    @ExcelProperty("最后发放时间")
    private LocalDateTime lastGrantTime;

    @Schema(description = "最后使用时间")
    @ExcelProperty("最后使用时间")
    private LocalDateTime lastUseTime;

    @Schema(description = "乐观锁版本号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("乐观锁版本号")
    private Integer version;

    @Schema(description = "备注", example = "你说的对")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createtime;

    @Schema(description = "更新时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("更新时间")
    private LocalDateTime updatetime;

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "3311")
    @ExcelProperty("租户编号")
    private Long tenantid;

}