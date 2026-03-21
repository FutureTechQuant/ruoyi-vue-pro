package cn.iocoder.yudao.module.asset.controller.admin.definition.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 资产定义新增/修改 Request VO")
@Data
public class DefinitionSaveReqVO {

    @Schema(description = "资产定义编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1415")
    private Long id;

    @Schema(description = "资产编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "资产编码不能为空")
    private String code;

    @Schema(description = "资产名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "赵六")
    @NotEmpty(message = "资产名称不能为空")
    private String name;

    @Schema(description = "资产类型：1报告 2课程 3咨询 99其他", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "资产类型：1报告 2课程 3咨询 99其他不能为空")
    private Integer assetType;

    @Schema(description = "履约类型：1QUOTA次数型 2ACCESS访问型 3APPOINTMENT预约型", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "履约类型：1QUOTA次数型 2ACCESS访问型 3APPOINTMENT预约型不能为空")
    private Integer fulfillmentType;

    @Schema(description = "单位类型：1次 2份 3天 4月 5席位", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "单位类型：1次 2份 3天 4月 5席位不能为空")
    private Integer unitType;

    @Schema(description = "过期规则：1永久 2固定时间 3领取后N天", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "过期规则：1永久 2固定时间 3领取后N天不能为空")
    private Integer expireRuleType;

    @Schema(description = "固定过期时间")
    private LocalDateTime fixedExpireTime;

    @Schema(description = "领取后有效天数")
    private Integer expireDays;

    @Schema(description = "是否支持退款回退", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "是否支持退款回退不能为空")
    private Boolean supportRefund;

    @Schema(description = "是否支持转移", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "是否支持转移不能为空")
    private Boolean supportTransfer;

    @Schema(description = "状态：1启用 0停用", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "状态：1启用 0停用不能为空")
    private Integer status;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "创建时间不能为空")
    private LocalDateTime createtime;

    @Schema(description = "更新时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "更新时间不能为空")
    private LocalDateTime updatetime;

    @Schema(description = "租户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "8824")
    @NotNull(message = "租户编号不能为空")
    private Long tenantid;

}