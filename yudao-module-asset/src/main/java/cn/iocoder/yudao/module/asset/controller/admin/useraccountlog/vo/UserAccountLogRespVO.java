package cn.iocoder.yudao.module.asset.controller.admin.useraccountlog.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 用户资产账户流水 Response VO")
@Data
@ExcelIgnoreUnannotated
public class UserAccountLogRespVO {

    @Schema(description = "用户资产账户流水编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "18264")
    @ExcelProperty("用户资产账户流水编号")
    private Long id;

    @Schema(description = "用户资产账户ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "15092")
    @ExcelProperty("用户资产账户ID")
    private Long accountId;

    @Schema(description = "用户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "18335")
    @ExcelProperty("用户编号")
    private Long userId;

    @Schema(description = "资产定义ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "18981")
    @ExcelProperty("资产定义ID")
    private Long assetId;

    @Schema(description = "资产来源ID", example = "6292")
    @ExcelProperty("资产来源ID")
    private Long sourceId;

    @Schema(description = "变动流水号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("变动流水号")
    private String changeNo;

    @Schema(description = "变动类型：1发放 2扣减 3退款回退 4后台增加 5后台扣减 6过期 7冻结 8解冻 9激活", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("变动类型：1发放 2扣减 3退款回退 4后台增加 5后台扣减 6过期 7冻结 8解冻 9激活")
    private Integer changeType;

    @Schema(description = "本次变动数量，增加为正，扣减为负", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("本次变动数量，增加为正，扣减为负")
    private Integer changeQuantity;

    @Schema(description = "变动前剩余数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("变动前剩余数量")
    private Integer beforeQuantity;

    @Schema(description = "变动后剩余数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("变动后剩余数量")
    private Integer afterQuantity;

    @Schema(description = "业务类型：1订单 2订单项 3售后 4报告任务 5课程开通 6咨询预约 7后台", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("业务类型：1订单 2订单项 3售后 4报告任务 5课程开通 6咨询预约 7后台")
    private Integer bizType;

    @Schema(description = "业务ID", example = "17398")
    @ExcelProperty("业务ID")
    private Long bizId;

    @Schema(description = "业务明细ID", example = "27924")
    @ExcelProperty("业务明细ID")
    private Long bizItemId;

    @Schema(description = "业务单号")
    @ExcelProperty("业务单号")
    private String bizNo;

    @Schema(description = "操作人ID", example = "22937")
    @ExcelProperty("操作人ID")
    private Long operatorUserId;

    @Schema(description = "操作人类型", example = "1")
    @ExcelProperty("操作人类型")
    private Integer operatorUserType;

    @Schema(description = "备注", example = "你说的对")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "操作时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("操作时间")
    private LocalDateTime operateTime;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createtime;

    @Schema(description = "更新时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("更新时间")
    private LocalDateTime updatetime;

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "28897")
    @ExcelProperty("租户编号")
    private Long tenantid;

}