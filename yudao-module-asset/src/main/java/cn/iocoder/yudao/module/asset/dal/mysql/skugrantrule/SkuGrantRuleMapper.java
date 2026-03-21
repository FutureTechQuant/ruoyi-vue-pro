package cn.iocoder.yudao.module.asset.dal.mysql.skugrantrule;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.asset.dal.dataobject.skugrantrule.SkuGrantRuleDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.asset.controller.admin.skugrantrule.vo.*;

/**
 * SKU资产发放规则 Mapper
 *
 * @author ci-codegen
 */
@Mapper
public interface SkuGrantRuleMapper extends BaseMapperX<SkuGrantRuleDO> {

    default PageResult<SkuGrantRuleDO> selectPage(SkuGrantRulePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<SkuGrantRuleDO>()
                .eqIfPresent(SkuGrantRuleDO::getSpuId, reqVO.getSpuId())
                .eqIfPresent(SkuGrantRuleDO::getSkuId, reqVO.getSkuId())
                .eqIfPresent(SkuGrantRuleDO::getAssetId, reqVO.getAssetId())
                .eqIfPresent(SkuGrantRuleDO::getAssetCodeSnapshot, reqVO.getAssetCodeSnapshot())
                .eqIfPresent(SkuGrantRuleDO::getAssetNameSnapshot, reqVO.getAssetNameSnapshot())
                .eqIfPresent(SkuGrantRuleDO::getFulfillmentType, reqVO.getFulfillmentType())
                .eqIfPresent(SkuGrantRuleDO::getUnitType, reqVO.getUnitType())
                .eqIfPresent(SkuGrantRuleDO::getGrantMode, reqVO.getGrantMode())
                .eqIfPresent(SkuGrantRuleDO::getGrantQuantity, reqVO.getGrantQuantity())
                .eqIfPresent(SkuGrantRuleDO::getGrantDays, reqVO.getGrantDays())
                .eqIfPresent(SkuGrantRuleDO::getPermanent, reqVO.getPermanent())
                .eqIfPresent(SkuGrantRuleDO::getEffectiveDelayDays, reqVO.getEffectiveDelayDays())
                .eqIfPresent(SkuGrantRuleDO::getExpireRuleType, reqVO.getExpireRuleType())
                .betweenIfPresent(SkuGrantRuleDO::getFixedExpireTime, reqVO.getFixedExpireTime())
                .eqIfPresent(SkuGrantRuleDO::getExpireDays, reqVO.getExpireDays())
                .eqIfPresent(SkuGrantRuleDO::getSort, reqVO.getSort())
                .eqIfPresent(SkuGrantRuleDO::getStatus, reqVO.getStatus())
                .eqIfPresent(SkuGrantRuleDO::getRemark, reqVO.getRemark())
                .betweenIfPresent(SkuGrantRuleDO::getCreatetime, reqVO.getCreatetime())
                .betweenIfPresent(SkuGrantRuleDO::getUpdatetime, reqVO.getUpdatetime())
                .eqIfPresent(SkuGrantRuleDO::getTenantid, reqVO.getTenantid())
                .orderByDesc(SkuGrantRuleDO::getId));
    }

}