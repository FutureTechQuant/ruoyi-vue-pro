package cn.iocoder.yudao.module.asset.controller.admin.usagerecord.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 资产使用记录分页 Request VO")
@Data
public class UsageRecordPageReqVO extends PageParam {

    @Schema(description = "用户资产账户ID", example = "9538")
    private Long accountId;

    @Schema(description = "资产来源ID", example = "2967")
    private Long sourceId;

    @Schema(description = "用户编号", example = "1876")
    private Long userId;

    @Schema(description = "资产定义ID", example = "29276")
    private Long assetId;

    @Schema(description = "使用流水号")
    private String usageNo;

    @Schema(description = "使用类型：1消费 2激活 3预约 4核销 5取消 6回退", example = "2")
    private Integer usageType;

    @Schema(description = "本次消耗数量")
    private Integer consumeQuantity;

    @Schema(description = "业务类型：1报告任务 2课程开通 3课程学习 4咨询预约 5后台", example = "1")
    private Integer bizType;

    @Schema(description = "业务ID", example = "17359")
    private Long bizId;

    @Schema(description = "业务单号")
    private String bizNo;

    @Schema(description = "状态：1待处理 2处理中 3成功 4取消 5失败", example = "1")
    private Integer status;

    @Schema(description = "预约/计划时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] scheduledTime;

    @Schema(description = "实际使用时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] usedTime;

    @Schema(description = "完成时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] finishTime;

    @Schema(description = "备注", example = "随便")
    private String remark;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createtime;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] updatetime;

    @Schema(description = "租户编号", example = "21008")
    private Long tenantid;

}