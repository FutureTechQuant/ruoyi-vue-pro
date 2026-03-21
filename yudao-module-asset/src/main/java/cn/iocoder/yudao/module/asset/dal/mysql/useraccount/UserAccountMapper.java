package cn.iocoder.yudao.module.asset.dal.mysql.useraccount;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccount.UserAccountDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.asset.controller.admin.useraccount.vo.*;

/**
 * 用户资产账户 Mapper
 *
 * @author ci-codegen
 */
@Mapper
public interface UserAccountMapper extends BaseMapperX<UserAccountDO> {

    default PageResult<UserAccountDO> selectPage(UserAccountPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<UserAccountDO>()
                .eqIfPresent(UserAccountDO::getUserId, reqVO.getUserId())
                .eqIfPresent(UserAccountDO::getAssetId, reqVO.getAssetId())
                .eqIfPresent(UserAccountDO::getAssetCodeSnapshot, reqVO.getAssetCodeSnapshot())
                .eqIfPresent(UserAccountDO::getAssetNameSnapshot, reqVO.getAssetNameSnapshot())
                .eqIfPresent(UserAccountDO::getAssetType, reqVO.getAssetType())
                .eqIfPresent(UserAccountDO::getFulfillmentType, reqVO.getFulfillmentType())
                .eqIfPresent(UserAccountDO::getUnitType, reqVO.getUnitType())
                .eqIfPresent(UserAccountDO::getTotalQuantity, reqVO.getTotalQuantity())
                .eqIfPresent(UserAccountDO::getUsedQuantity, reqVO.getUsedQuantity())
                .eqIfPresent(UserAccountDO::getRefundQuantity, reqVO.getRefundQuantity())
                .eqIfPresent(UserAccountDO::getAdjustQuantity, reqVO.getAdjustQuantity())
                .eqIfPresent(UserAccountDO::getRemainQuantity, reqVO.getRemainQuantity())
                .eqIfPresent(UserAccountDO::getFreezeQuantity, reqVO.getFreezeQuantity())
                .eqIfPresent(UserAccountDO::getStatus, reqVO.getStatus())
                .betweenIfPresent(UserAccountDO::getEffectiveTime, reqVO.getEffectiveTime())
                .betweenIfPresent(UserAccountDO::getExpireTime, reqVO.getExpireTime())
                .betweenIfPresent(UserAccountDO::getLastGrantTime, reqVO.getLastGrantTime())
                .betweenIfPresent(UserAccountDO::getLastUseTime, reqVO.getLastUseTime())
                .eqIfPresent(UserAccountDO::getVersion, reqVO.getVersion())
                .eqIfPresent(UserAccountDO::getRemark, reqVO.getRemark())
                .betweenIfPresent(UserAccountDO::getCreatetime, reqVO.getCreatetime())
                .betweenIfPresent(UserAccountDO::getUpdatetime, reqVO.getUpdatetime())
                .eqIfPresent(UserAccountDO::getTenantid, reqVO.getTenantid())
                .orderByDesc(UserAccountDO::getId));
    }

}