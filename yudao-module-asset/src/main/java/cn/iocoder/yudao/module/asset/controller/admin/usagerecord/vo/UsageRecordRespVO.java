package cn.iocoder.yudao.module.asset.controller.admin.usagerecord.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 资产使用记录 Response VO")
@Data
@ExcelIgnoreUnannotated
public class UsageRecordRespVO {

    @Schema(description = "资产使用记录编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "5023")
    @ExcelProperty("资产使用记录编号")
    private Long id;

    @Schema(description = "用户资产账户ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "9538")
    @ExcelProperty("用户资产账户ID")
    private Long accountId;

    @Schema(description = "资产来源ID", example = "2967")
    @ExcelProperty("资产来源ID")
    private Long sourceId;

    @Schema(description = "用户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1876")
    @ExcelProperty("用户编号")
    private Long userId;

    @Schema(description = "资产定义ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "29276")
    @ExcelProperty("资产定义ID")
    private Long assetId;

    @Schema(description = "使用流水号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("使用流水号")
    private String usageNo;

    @Schema(description = "使用类型：1消费 2激活 3预约 4核销 5取消 6回退", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("使用类型：1消费 2激活 3预约 4核销 5取消 6回退")
    private Integer usageType;

    @Schema(description = "本次消耗数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("本次消耗数量")
    private Integer consumeQuantity;

    @Schema(description = "业务类型：1报告任务 2课程开通 3课程学习 4咨询预约 5后台", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("业务类型：1报告任务 2课程开通 3课程学习 4咨询预约 5后台")
    private Integer bizType;

    @Schema(description = "业务ID", example = "17359")
    @ExcelProperty("业务ID")
    private Long bizId;

    @Schema(description = "业务单号")
    @ExcelProperty("业务单号")
    private String bizNo;

    @Schema(description = "状态：1待处理 2处理中 3成功 4取消 5失败", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("状态：1待处理 2处理中 3成功 4取消 5失败")
    private Integer status;

    @Schema(description = "预约/计划时间")
    @ExcelProperty("预约/计划时间")
    private LocalDateTime scheduledTime;

    @Schema(description = "实际使用时间")
    @ExcelProperty("实际使用时间")
    private LocalDateTime usedTime;

    @Schema(description = "完成时间")
    @ExcelProperty("完成时间")
    private LocalDateTime finishTime;

    @Schema(description = "备注", example = "随便")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createtime;

    @Schema(description = "更新时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("更新时间")
    private LocalDateTime updatetime;

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "21008")
    @ExcelProperty("租户编号")
    private Long tenantid;

}