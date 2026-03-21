package cn.iocoder.yudao.module.asset.dal.dataobject.definition;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 资产定义 DO
 *
 * @author ci-codegen
 */
@TableName("asset_definition")
@KeySequence("asset_definition_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DefinitionDO extends BaseDO {

    /**
     * 资产定义编号
     */
    @TableId
    private Long id;
    /**
     * 资产编码
     */
    private String code;
    /**
     * 资产名称
     */
    private String name;
    /**
     * 资产类型：1报告 2课程 3咨询 99其他
     */
    private Integer assetType;
    /**
     * 履约类型：1QUOTA次数型 2ACCESS访问型 3APPOINTMENT预约型
     */
    private Integer fulfillmentType;
    /**
     * 单位类型：1次 2份 3天 4月 5席位
     */
    private Integer unitType;
    /**
     * 过期规则：1永久 2固定时间 3领取后N天
     */
    private Integer expireRuleType;
    /**
     * 固定过期时间
     */
    private LocalDateTime fixedExpireTime;
    /**
     * 领取后有效天数
     */
    private Integer expireDays;
    /**
     * 是否支持退款回退
     */
    private Boolean supportRefund;
    /**
     * 是否支持转移
     */
    private Boolean supportTransfer;
    /**
     * 状态：1启用 0停用
     */
    private Integer status;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private LocalDateTime createtime;
    /**
     * 更新时间
     */
    private LocalDateTime updatetime;
    /**
     * 租户编号
     */
    private Long tenantid;


}