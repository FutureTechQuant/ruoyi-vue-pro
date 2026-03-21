package cn.iocoder.yudao.module.asset.dal.dataobject.skugrantrule;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * SKU资产发放规则 DO
 *
 * @author ci-codegen
 */
@TableName("asset_sku_grant_rule")
@KeySequence("asset_sku_grant_rule_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SkuGrantRuleDO extends BaseDO {

    /**
     * SKU资产发放规则编号
     */
    @TableId
    private Long id;
    /**
     * 商品SPU ID
     */
    private Long spuId;
    /**
     * 商品SKU ID
     */
    private Long skuId;
    /**
     * 资产定义ID
     */
    private Long assetId;
    /**
     * 资产编码快照
     */
    private String assetCodeSnapshot;
    /**
     * 资产名称快照
     */
    private String assetNameSnapshot;
    /**
     * 履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT
     */
    private Integer fulfillmentType;
    /**
     * 单位类型快照：1次 2份 3天 4月 5席位
     */
    private Integer unitType;
    /**
     * 发放模式：1固定数量 2固定天数 3永久访问
     */
    private Integer grantMode;
    /**
     * 发放数量；次数型/预约型使用
     */
    private Integer grantQuantity;
    /**
     * 发放天数；访问型使用
     */
    private Integer grantDays;
    /**
     * 是否永久有效
     */
    private Boolean permanent;
    /**
     * 生效延迟天数
     */
    private Integer effectiveDelayDays;
    /**
     * 过期规则：0跟随资产定义 1永久 2固定时间 3领取后N天
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
     * 排序
     */
    private Integer sort;
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