package cn.iocoder.yudao.module.asset.dal.mysql.usagerecord;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.asset.dal.dataobject.usagerecord.UsageRecordDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.asset.controller.admin.usagerecord.vo.*;

/**
 * 资产使用记录 Mapper
 *
 * @author ci-codegen
 */
@Mapper
public interface UsageRecordMapper extends BaseMapperX<UsageRecordDO> {

    default PageResult<UsageRecordDO> selectPage(UsageRecordPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<UsageRecordDO>()
                .eqIfPresent(UsageRecordDO::getAccountId, reqVO.getAccountId())
                .eqIfPresent(UsageRecordDO::getSourceId, reqVO.getSourceId())
                .eqIfPresent(UsageRecordDO::getUserId, reqVO.getUserId())
                .eqIfPresent(UsageRecordDO::getAssetId, reqVO.getAssetId())
                .eqIfPresent(UsageRecordDO::getUsageNo, reqVO.getUsageNo())
                .eqIfPresent(UsageRecordDO::getUsageType, reqVO.getUsageType())
                .eqIfPresent(UsageRecordDO::getConsumeQuantity, reqVO.getConsumeQuantity())
                .eqIfPresent(UsageRecordDO::getBizType, reqVO.getBizType())
                .eqIfPresent(UsageRecordDO::getBizId, reqVO.getBizId())
                .eqIfPresent(UsageRecordDO::getBizNo, reqVO.getBizNo())
                .eqIfPresent(UsageRecordDO::getStatus, reqVO.getStatus())
                .betweenIfPresent(UsageRecordDO::getScheduledTime, reqVO.getScheduledTime())
                .betweenIfPresent(UsageRecordDO::getUsedTime, reqVO.getUsedTime())
                .betweenIfPresent(UsageRecordDO::getFinishTime, reqVO.getFinishTime())
                .eqIfPresent(UsageRecordDO::getRemark, reqVO.getRemark())
                .betweenIfPresent(UsageRecordDO::getCreatetime, reqVO.getCreatetime())
                .betweenIfPresent(UsageRecordDO::getUpdatetime, reqVO.getUpdatetime())
                .eqIfPresent(UsageRecordDO::getTenantid, reqVO.getTenantid())
                .orderByDesc(UsageRecordDO::getId));
    }

}