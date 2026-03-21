package cn.iocoder.yudao.module.asset.dal.dataobject.useraccount;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 用户资产账户 DO
 *
 * @author ci-codegen
 */
@TableName("asset_user_account")
@KeySequence("asset_user_account_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountDO extends BaseDO {

    /**
     * 用户资产账户编号
     */
    @TableId
    private Long id;
    /**
     * 用户编号
     */
    private Long userId;
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
     * 资产类型快照：1报告 2课程 3咨询 99其他
     */
    private Integer assetType;
    /**
     * 履约类型快照：1QUOTA 2ACCESS 3APPOINTMENT
     */
    private Integer fulfillmentType;
    /**
     * 单位类型快照：1次 2份 3天 4月 5席位
     */
    private Integer unitType;
    /**
     * 累计发放数量
     */
    private Integer totalQuantity;
    /**
     * 累计已使用数量
     */
    private Integer usedQuantity;
    /**
     * 累计退款回退数量
     */
    private Integer refundQuantity;
    /**
     * 累计人工调整数量
     */
    private Integer adjustQuantity;
    /**
     * 当前剩余数量
     */
    private Integer remainQuantity;
    /**
     * 冻结数量
     */
    private Integer freezeQuantity;
    /**
     * 状态：1正常 2冻结 3失效 4用尽
     */
    private Integer status;
    /**
     * 生效时间
     */
    private LocalDateTime effectiveTime;
    /**
     * 过期时间
     */
    private LocalDateTime expireTime;
    /**
     * 最后发放时间
     */
    private LocalDateTime lastGrantTime;
    /**
     * 最后使用时间
     */
    private LocalDateTime lastUseTime;
    /**
     * 乐观锁版本号
     */
    private Integer version;
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