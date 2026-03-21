package cn.iocoder.yudao.module.asset.controller.admin.useraccount.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 用户资产账户分页 Request VO")
@Data
public class UserAccountPageReqVO extends PageParam {

    @Schema(description = "用户编号", example = "31145")
    private Long userId;

    @Schema(description = "资产定义ID", example = "13227")
    private Long assetId;

    @Schema(description = "资产编码快照")
    private String assetCodeSnapshot;

    @Schema(description = "资产名称快照")
    private String assetNameSnapshot;

    @Schema(description = "资产类型快照：1报告 2课程 3咨询 99其他", example = "1")
    private Integer assetType;

    @Schema(description = "履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT", example = "2")
    private Integer fulfillmentType;

    @Schema(description = "单位类型快照：1次 2份 3天 4月 5席位", example = "2")
    private Integer unitType;

    @Schema(description = "累计发放数量")
    private Integer totalQuantity;

    @Schema(description = "累计已使用数量")
    private Integer usedQuantity;

    @Schema(description = "累计退款回退数量")
    private Integer refundQuantity;

    @Schema(description = "累计人工调整数量")
    private Integer adjustQuantity;

    @Schema(description = "当前剩余数量")
    private Integer remainQuantity;

    @Schema(description = "冻结数量")
    private Integer freezeQuantity;

    @Schema(description = "状态：1正常 2冻结 3失效 4用尽", example = "2")
    private Integer status;

    @Schema(description = "生效时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] effectiveTime;

    @Schema(description = "过期时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] expireTime;

    @Schema(description = "最后发放时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] lastGrantTime;

    @Schema(description = "最后使用时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] lastUseTime;

    @Schema(description = "乐观锁版本号")
    private Integer version;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createtime;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] updatetime;

    @Schema(description = "租户编号", example = "3311")
    private Long tenantid;

}