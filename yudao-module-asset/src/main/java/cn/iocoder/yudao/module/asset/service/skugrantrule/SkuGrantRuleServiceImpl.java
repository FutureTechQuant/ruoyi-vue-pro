package cn.iocoder.yudao.module.asset.service.skugrantrule;

import cn.hutool.core.collection.CollUtil;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.asset.controller.admin.skugrantrule.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.skugrantrule.SkuGrantRuleDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.asset.dal.mysql.skugrantrule.SkuGrantRuleMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
import static cn.iocoder.yudao.module.asset.enums.ErrorCodeConstants.*;

/**
 * SKU资产发放规则 Service 实现类
 *
 * @author ci-codegen
 */
@Service
@Validated
public class SkuGrantRuleServiceImpl implements SkuGrantRuleService {

    @Resource
    private SkuGrantRuleMapper skuGrantRuleMapper;

    @Override
    public Long createSkuGrantRule(SkuGrantRuleSaveReqVO createReqVO) {
        // 插入
        SkuGrantRuleDO skuGrantRule = BeanUtils.toBean(createReqVO, SkuGrantRuleDO.class);
        skuGrantRuleMapper.insert(skuGrantRule);

        // 返回
        return skuGrantRule.getId();
    }

    @Override
    public void updateSkuGrantRule(SkuGrantRuleSaveReqVO updateReqVO) {
        // 校验存在
        validateSkuGrantRuleExists(updateReqVO.getId());
        // 更新
        SkuGrantRuleDO updateObj = BeanUtils.toBean(updateReqVO, SkuGrantRuleDO.class);
        skuGrantRuleMapper.updateById(updateObj);
    }

    @Override
    public void deleteSkuGrantRule(Long id) {
        // 校验存在
        validateSkuGrantRuleExists(id);
        // 删除
        skuGrantRuleMapper.deleteById(id);
    }

    @Override
        public void deleteSkuGrantRuleListByIds(List<Long> ids) {
        // 删除
        skuGrantRuleMapper.deleteByIds(ids);
        }


    private void validateSkuGrantRuleExists(Long id) {
        if (skuGrantRuleMapper.selectById(id) == null) {
            throw exception(SKU_GRANT_RULE_NOT_EXISTS);
        }
    }

    @Override
    public SkuGrantRuleDO getSkuGrantRule(Long id) {
        return skuGrantRuleMapper.selectById(id);
    }

    @Override
    public PageResult<SkuGrantRuleDO> getSkuGrantRulePage(SkuGrantRulePageReqVO pageReqVO) {
        return skuGrantRuleMapper.selectPage(pageReqVO);
    }

}