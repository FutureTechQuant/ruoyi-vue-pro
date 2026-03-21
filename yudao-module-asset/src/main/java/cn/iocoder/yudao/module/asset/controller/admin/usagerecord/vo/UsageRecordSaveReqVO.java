package cn.iocoder.yudao.module.asset.controller.admin.usagerecord.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 资产使用记录新增/修改 Request VO")
@Data
public class UsageRecordSaveReqVO {

    @Schema(description = "资产使用记录编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "5023")
    private Long id;

    @Schema(description = "用户资产账户ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "9538")
    @NotNull(message = "用户资产账户ID不能为空")
    private Long accountId;

    @Schema(description = "资产来源ID", example = "2967")
    private Long sourceId;

    @Schema(description = "用户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1876")
    @NotNull(message = "用户编号不能为空")
    private Long userId;

    @Schema(description = "资产定义ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "29276")
    @NotNull(message = "资产定义ID不能为空")
    private Long assetId;

    @Schema(description = "使用流水号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "使用流水号不能为空")
    private String usageNo;

    @Schema(description = "使用类型：1消费 2激活 3预约 4核销 5取消 6回退", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "使用类型：1消费 2激活 3预约 4核销 5取消 6回退不能为空")
    private Integer usageType;

    @Schema(description = "本次消耗数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "本次消耗数量不能为空")
    private Integer consumeQuantity;

    @Schema(description = "业务类型：1报告任务 2课程开通 3课程学习 4咨询预约 5后台", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "业务类型：1报告任务 2课程开通 3课程学习 4咨询预约 5后台不能为空")
    private Integer bizType;

    @Schema(description = "业务ID", example = "17359")
    private Long bizId;

    @Schema(description = "业务单号")
    private String bizNo;

    @Schema(description = "状态：1待处理 2处理中 3成功 4取消 5失败", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "状态：1待处理 2处理中 3成功 4取消 5失败不能为空")
    private Integer status;

    @Schema(description = "预约/计划时间")
    private LocalDateTime scheduledTime;

    @Schema(description = "实际使用时间")
    private LocalDateTime usedTime;

    @Schema(description = "完成时间")
    private LocalDateTime finishTime;

    @Schema(description = "备注", example = "随便")
    private String remark;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "创建时间不能为空")
    private LocalDateTime createtime;

    @Schema(description = "更新时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "更新时间不能为空")
    private LocalDateTime updatetime;

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "21008")
    @NotNull(message = "租户编号不能为空")
    private Long tenantid;

}