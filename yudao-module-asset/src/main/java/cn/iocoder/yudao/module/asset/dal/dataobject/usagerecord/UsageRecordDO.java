package cn.iocoder.yudao.module.asset.dal.dataobject.usagerecord;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 资产使用记录 DO
 *
 * @author ci-codegen
 */
@TableName("asset_usage_record")
@KeySequence("asset_usage_record_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsageRecordDO extends BaseDO {

    /**
     * 资产使用记录编号
     */
    @TableId
    private Long id;
    /**
     * 用户资产账户ID
     */
    private Long accountId;
    /**
     * 资产来源ID
     */
    private Long sourceId;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 资产定义ID
     */
    private Long assetId;
    /**
     * 使用流水号
     */
    private String usageNo;
    /**
     * 使用类型：1消费 2激活 3预约 4核销 5取消 6回退
     */
    private Integer usageType;
    /**
     * 本次消耗数量
     */
    private Integer consumeQuantity;
    /**
     * 业务类型：1报告任务 2课程开通 3课程学习 4咨询预约 5后台
     */
    private Integer bizType;
    /**
     * 业务ID
     */
    private Long bizId;
    /**
     * 业务单号
     */
    private String bizNo;
    /**
     * 状态：1待处理 2处理中 3成功 4取消 5失败
     */
    private Integer status;
    /**
     * 预约/计划时间
     */
    private LocalDateTime scheduledTime;
    /**
     * 实际使用时间
     */
    private LocalDateTime usedTime;
    /**
     * 完成时间
     */
    private LocalDateTime finishTime;
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