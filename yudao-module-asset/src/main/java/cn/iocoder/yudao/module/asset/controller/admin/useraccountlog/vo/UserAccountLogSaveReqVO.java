package cn.iocoder.yudao.module.asset.controller.admin.useraccountlog.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 用户资产账户流水新增/修改 Request VO")
@Data
public class UserAccountLogSaveReqVO {

    @Schema(description = "用户资产账户流水编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "18264")
    private Long id;

    @Schema(description = "用户资产账户ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "15092")
    @NotNull(message = "用户资产账户ID不能为空")
    private Long accountId;

    @Schema(description = "用户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "18335")
    @NotNull(message = "用户编号不能为空")
    private Long userId;

    @Schema(description = "资产定义ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "18981")
    @NotNull(message = "资产定义ID不能为空")
    private Long assetId;

    @Schema(description = "资产来源ID", example = "6292")
    private Long sourceId;

    @Schema(description = "变动流水号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "变动流水号不能为空")
    private String changeNo;

    @Schema(description = "变动类型：1发放 2扣减 3退款回退 4后台增加 5后台扣减 6过期 7冻结 8解冻 9激活", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "变动类型：1发放 2扣减 3退款回退 4后台增加 5后台扣减 6过期 7冻结 8解冻 9激活不能为空")
    private Integer changeType;

    @Schema(description = "本次变动数量，增加为正，扣减为负", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "本次变动数量，增加为正，扣减为负不能为空")
    private Integer changeQuantity;

    @Schema(description = "变动前剩余数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "变动前剩余数量不能为空")
    private Integer beforeQuantity;

    @Schema(description = "变动后剩余数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "变动后剩余数量不能为空")
    private Integer afterQuantity;

    @Schema(description = "业务类型：1订单 2订单项 3售后 4报告任务 5课程开通 6咨询预约 7后台", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "业务类型：1订单 2订单项 3售后 4报告任务 5课程开通 6咨询预约 7后台不能为空")
    private Integer bizType;

    @Schema(description = "业务ID", example = "17398")
    private Long bizId;

    @Schema(description = "业务明细ID", example = "27924")
    private Long bizItemId;

    @Schema(description = "业务单号")
    private String bizNo;

    @Schema(description = "操作人ID", example = "22937")
    private Long operatorUserId;

    @Schema(description = "操作人类型", example = "1")
    private Integer operatorUserType;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "操作时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "操作时间不能为空")
    private LocalDateTime operateTime;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "创建时间不能为空")
    private LocalDateTime createtime;

    @Schema(description = "更新时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "更新时间不能为空")
    private LocalDateTime updatetime;

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "28897")
    @NotNull(message = "租户编号不能为空")
    private Long tenantid;

}