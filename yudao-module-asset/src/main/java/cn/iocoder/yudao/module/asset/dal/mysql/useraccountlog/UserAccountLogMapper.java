package cn.iocoder.yudao.module.asset.dal.mysql.useraccountlog;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccountlog.UserAccountLogDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.asset.controller.admin.useraccountlog.vo.*;

/**
 * 用户资产账户流水 Mapper
 *
 * @author ci-codegen
 */
@Mapper
public interface UserAccountLogMapper extends BaseMapperX<UserAccountLogDO> {

    default PageResult<UserAccountLogDO> selectPage(UserAccountLogPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<UserAccountLogDO>()
                .eqIfPresent(UserAccountLogDO::getAccountId, reqVO.getAccountId())
                .eqIfPresent(UserAccountLogDO::getUserId, reqVO.getUserId())
                .eqIfPresent(UserAccountLogDO::getAssetId, reqVO.getAssetId())
                .eqIfPresent(UserAccountLogDO::getSourceId, reqVO.getSourceId())
                .eqIfPresent(UserAccountLogDO::getChangeNo, reqVO.getChangeNo())
                .eqIfPresent(UserAccountLogDO::getChangeType, reqVO.getChangeType())
                .eqIfPresent(UserAccountLogDO::getChangeQuantity, reqVO.getChangeQuantity())
                .eqIfPresent(UserAccountLogDO::getBeforeQuantity, reqVO.getBeforeQuantity())
                .eqIfPresent(UserAccountLogDO::getAfterQuantity, reqVO.getAfterQuantity())
                .eqIfPresent(UserAccountLogDO::getBizType, reqVO.getBizType())
                .eqIfPresent(UserAccountLogDO::getBizId, reqVO.getBizId())
                .eqIfPresent(UserAccountLogDO::getBizItemId, reqVO.getBizItemId())
                .eqIfPresent(UserAccountLogDO::getBizNo, reqVO.getBizNo())
                .eqIfPresent(UserAccountLogDO::getOperatorUserId, reqVO.getOperatorUserId())
                .eqIfPresent(UserAccountLogDO::getOperatorUserType, reqVO.getOperatorUserType())
                .eqIfPresent(UserAccountLogDO::getRemark, reqVO.getRemark())
                .betweenIfPresent(UserAccountLogDO::getOperateTime, reqVO.getOperateTime())
                .betweenIfPresent(UserAccountLogDO::getCreatetime, reqVO.getCreatetime())
                .betweenIfPresent(UserAccountLogDO::getUpdatetime, reqVO.getUpdatetime())
                .eqIfPresent(UserAccountLogDO::getTenantid, reqVO.getTenantid())
                .orderByDesc(UserAccountLogDO::getId));
    }

}