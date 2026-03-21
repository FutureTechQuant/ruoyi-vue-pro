package cn.iocoder.yudao.module.asset.dal.dataobject.useraccountsource;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 用户资产来源 DO
 *
 * @author ci-codegen
 */
@TableName("asset_user_account_source")
@KeySequence("asset_user_account_source_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountSourceDO extends BaseDO {

    /**
     * 用户资产来源编号
     */
    @TableId
    private Long id;
    /**
     * 用户资产账户ID
     */
    private Long accountId;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 资产定义ID
     */
    private Long assetId;
    /**
     * 来源类型：1订单购买 2活动赠送 3后台赠送 4退款回退 5补发
     */
    private Integer sourceType;
    /**
     * 来源业务ID
     */
    private Long sourceId;
    /**
     * 来源业务明细ID
     */
    private Long sourceItemId;
    /**
     * 来源单号
     */
    private String sourceNo;
    /**
     * 订单ID
     */
    private Long orderId;
    /**
     * 订单项ID
     */
    private Long orderItemId;
    /**
     * 商品SPU ID
     */
    private Long spuId;
    /**
     * 商品SKU ID
     */
    private Long skuId;
    /**
     * 发放模式：1固定数量 2固定天数 3永久访问
     */
    private Integer grantMode;
    /**
     * 本来源发放数量
     */
    private Integer grantQuantity;
    /**
     * 本来源已使用数量
     */
    private Integer usedQuantity;
    /**
     * 本来源剩余数量
     */
    private Integer remainQuantity;
    /**
     * 本来源发放天数
     */
    private Integer grantDays;
    /**
     * 是否永久有效
     */
    private Boolean permanent;
    /**
     * 生效时间
     */
    private LocalDateTime effectiveTime;
    /**
     * 过期时间
     */
    private LocalDateTime expireTime;
    /**
     * 状态：1正常 2已用尽 3已退完 4已失效
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