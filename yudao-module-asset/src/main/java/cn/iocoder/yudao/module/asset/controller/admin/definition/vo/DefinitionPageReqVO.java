package cn.iocoder.yudao.module.asset.controller.admin.definition.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 资产定义分页 Request VO")
@Data
public class DefinitionPageReqVO extends PageParam {

    @Schema(description = "资产编码")
    private String code;

    @Schema(description = "资产名称", example = "赵六")
    private String name;

    @Schema(description = "资产类型：1报告 2课程 3咨询 99其他", example = "1")
    private Integer assetType;

    @Schema(description = "履约类型：1QUOTA次数型 2ACCESS访问型 3APPOINTMENT预约型", example = "1")
    private Integer fulfillmentType;

    @Schema(description = "单位类型：1次 2份 3天 4月 5席位", example = "1")
    private Integer unitType;

    @Schema(description = "过期规则：1永久 2固定时间 3领取后N天", example = "2")
    private Integer expireRuleType;

    @Schema(description = "固定过期时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] fixedExpireTime;

    @Schema(description = "领取后有效天数")
    private Integer expireDays;

    @Schema(description = "是否支持退款回退")
    private Boolean supportRefund;

    @Schema(description = "是否支持转移")
    private Boolean supportTransfer;

    @Schema(description = "状态：1启用 0停用", example = "2")
    private Integer status;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createtime;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] updatetime;

    @Schema(description = "租户编号", example = "8824")
    private Long tenantid;

}