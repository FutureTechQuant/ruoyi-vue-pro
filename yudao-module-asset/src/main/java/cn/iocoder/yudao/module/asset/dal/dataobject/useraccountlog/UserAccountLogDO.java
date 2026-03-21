package cn.iocoder.yudao.module.asset.dal.dataobject.useraccountlog;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 用户资产账户流水 DO
 *
 * @author ci-codegen
 */
@TableName("asset_user_account_log")
@KeySequence("asset_user_account_log_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountLogDO extends BaseDO {

    /**
     * 用户资产账户流水编号
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
     * 资产来源ID
     */
    private Long sourceId;
    /**
     * 变动流水号
     */
    private String changeNo;
    /**
     * 变动类型：1发放 2扣减 3退款回退 4后台增加 5后台扣减 6过期 7冻结 8解冻 9激活
     */
    private Integer changeType;
    /**
     * 本次变动数量，增加为正，扣减为负
     */
    private Integer changeQuantity;
    /**
     * 变动前剩余数量
     */
    private Integer beforeQuantity;
    /**
     * 变动后剩余数量
     */
    private Integer afterQuantity;
    /**
     * 业务类型：1订单 2订单项 3售后 4报告任务 5课程开通 6咨询预约 7后台
     */
    private Integer bizType;
    /**
     * 业务ID
     */
    private Long bizId;
    /**
     * 业务明细ID
     */
    private Long bizItemId;
    /**
     * 业务单号
     */
    private String bizNo;
    /**
     * 操作人ID
     */
    private Long operatorUserId;
    /**
     * 操作人类型
     */
    private Integer operatorUserType;
    /**
     * 备注
     */
    private String remark;
    /**
     * 操作时间
     */
    private LocalDateTime operateTime;
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