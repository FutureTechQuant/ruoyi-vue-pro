package cn.iocoder.yudao.module.asset.dal.mysql.useraccountsource;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccountsource.UserAccountSourceDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.asset.controller.admin.useraccountsource.vo.*;

/**
 * 用户资产来源 Mapper
 *
 * @author ci-codegen
 */
@Mapper
public interface UserAccountSourceMapper extends BaseMapperX<UserAccountSourceDO> {

    default PageResult<UserAccountSourceDO> selectPage(UserAccountSourcePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<UserAccountSourceDO>()
                .eqIfPresent(UserAccountSourceDO::getAccountId, reqVO.getAccountId())
                .eqIfPresent(UserAccountSourceDO::getUserId, reqVO.getUserId())
                .eqIfPresent(UserAccountSourceDO::getAssetId, reqVO.getAssetId())
                .eqIfPresent(UserAccountSourceDO::getSourceType, reqVO.getSourceType())
                .eqIfPresent(UserAccountSourceDO::getSourceId, reqVO.getSourceId())
                .eqIfPresent(UserAccountSourceDO::getSourceItemId, reqVO.getSourceItemId())
                .eqIfPresent(UserAccountSourceDO::getSourceNo, reqVO.getSourceNo())
                .eqIfPresent(UserAccountSourceDO::getOrderId, reqVO.getOrderId())
                .eqIfPresent(UserAccountSourceDO::getOrderItemId, reqVO.getOrderItemId())
                .eqIfPresent(UserAccountSourceDO::getSpuId, reqVO.getSpuId())
                .eqIfPresent(UserAccountSourceDO::getSkuId, reqVO.getSkuId())
                .eqIfPresent(UserAccountSourceDO::getGrantMode, reqVO.getGrantMode())
                .eqIfPresent(UserAccountSourceDO::getGrantQuantity, reqVO.getGrantQuantity())
                .eqIfPresent(UserAccountSourceDO::getUsedQuantity, reqVO.getUsedQuantity())
                .eqIfPresent(UserAccountSourceDO::getRemainQuantity, reqVO.getRemainQuantity())
                .eqIfPresent(UserAccountSourceDO::getGrantDays, reqVO.getGrantDays())
                .eqIfPresent(UserAccountSourceDO::getPermanent, reqVO.getPermanent())
                .betweenIfPresent(UserAccountSourceDO::getEffectiveTime, reqVO.getEffectiveTime())
                .betweenIfPresent(UserAccountSourceDO::getExpireTime, reqVO.getExpireTime())
                .eqIfPresent(UserAccountSourceDO::getStatus, reqVO.getStatus())
                .eqIfPresent(UserAccountSourceDO::getRemark, reqVO.getRemark())
                .betweenIfPresent(UserAccountSourceDO::getCreatetime, reqVO.getCreatetime())
                .betweenIfPresent(UserAccountSourceDO::getUpdatetime, reqVO.getUpdatetime())
                .eqIfPresent(UserAccountSourceDO::getTenantid, reqVO.getTenantid())
                .orderByDesc(UserAccountSourceDO::getId));
    }

}