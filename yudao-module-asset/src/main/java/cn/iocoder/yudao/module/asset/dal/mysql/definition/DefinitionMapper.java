package cn.iocoder.yudao.module.asset.dal.mysql.definition;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.asset.dal.dataobject.definition.DefinitionDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.asset.controller.admin.definition.vo.*;

/**
 * 资产定义 Mapper
 *
 * @author ci-codegen
 */
@Mapper
public interface DefinitionMapper extends BaseMapperX<DefinitionDO> {

    default PageResult<DefinitionDO> selectPage(DefinitionPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<DefinitionDO>()
                .eqIfPresent(DefinitionDO::getCode, reqVO.getCode())
                .likeIfPresent(DefinitionDO::getName, reqVO.getName())
                .eqIfPresent(DefinitionDO::getAssetType, reqVO.getAssetType())
                .eqIfPresent(DefinitionDO::getFulfillmentType, reqVO.getFulfillmentType())
                .eqIfPresent(DefinitionDO::getUnitType, reqVO.getUnitType())
                .eqIfPresent(DefinitionDO::getExpireRuleType, reqVO.getExpireRuleType())
                .betweenIfPresent(DefinitionDO::getFixedExpireTime, reqVO.getFixedExpireTime())
                .eqIfPresent(DefinitionDO::getExpireDays, reqVO.getExpireDays())
                .eqIfPresent(DefinitionDO::getSupportRefund, reqVO.getSupportRefund())
                .eqIfPresent(DefinitionDO::getSupportTransfer, reqVO.getSupportTransfer())
                .eqIfPresent(DefinitionDO::getStatus, reqVO.getStatus())
                .eqIfPresent(DefinitionDO::getRemark, reqVO.getRemark())
                .betweenIfPresent(DefinitionDO::getCreatetime, reqVO.getCreatetime())
                .betweenIfPresent(DefinitionDO::getUpdatetime, reqVO.getUpdatetime())
                .eqIfPresent(DefinitionDO::getTenantid, reqVO.getTenantid())
                .orderByDesc(DefinitionDO::getId));
    }

}