package cn.iocoder.yudao.module.asset.controller.admin.useraccount.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 用户资产账户新增/修改 Request VO")
@Data
public class UserAccountSaveReqVO {

    @Schema(description = "用户资产账户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "6900")
    private Long id;

    @Schema(description = "用户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "31145")
    @NotNull(message = "用户编号不能为空")
    private Long userId;

    @Schema(description = "资产定义ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "13227")
    @NotNull(message = "资产定义ID不能为空")
    private Long assetId;

    @Schema(description = "资产编码快照", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "资产编码快照不能为空")
    private String assetCodeSnapshot;

    @Schema(description = "资产名称快照", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "资产名称快照不能为空")
    private String assetNameSnapshot;

    @Schema(description = "资产类型快照：1报告 2课程 3咨询 99其他", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "资产类型快照：1报告 2课程 3咨询 99其他不能为空")
    private Integer assetType;

    @Schema(description = "履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT不能为空")
    private Integer fulfillmentType;

    @Schema(description = "单位类型快照：1次 2份 3天 4月 5席位", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "单位类型快照：1次 2份 3天 4月 5席位不能为空")
    private Integer unitType;

    @Schema(description = "累计发放数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "累计发放数量不能为空")
    private Integer totalQuantity;

    @Schema(description = "累计已使用数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "累计已使用数量不能为空")
    private Integer usedQuantity;

    @Schema(description = "累计退款回退数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "累计退款回退数量不能为空")
    private Integer refundQuantity;

    @Schema(description = "累计人工调整数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "累计人工调整数量不能为空")
    private Integer adjustQuantity;

    @Schema(description = "当前剩余数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "当前剩余数量不能为空")
    private Integer remainQuantity;

    @Schema(description = "冻结数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "冻结数量不能为空")
    private Integer freezeQuantity;

    @Schema(description = "状态：1正常 2冻结 3失效 4用尽", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "状态：1正常 2冻结 3失效 4用尽不能为空")
    private Integer status;

    @Schema(description = "生效时间")
    private LocalDateTime effectiveTime;

    @Schema(description = "过期时间")
    private LocalDateTime expireTime;

    @Schema(description = "最后发放时间")
    private LocalDateTime lastGrantTime;

    @Schema(description = "最后使用时间")
    private LocalDateTime lastUseTime;

    @Schema(description = "乐观锁版本号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "乐观锁版本号不能为空")
    private Integer version;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "创建时间不能为空")
    private LocalDateTime createtime;

    @Schema(description = "更新时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "更新时间不能为空")
    private LocalDateTime updatetime;

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "3311")
    @NotNull(message = "租户编号不能为空")
    private Long tenantid;

}