package cn.iocoder.yudao.module.asset.service.skugrantrule;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.asset.controller.admin.skugrantrule.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.skugrantrule.SkuGrantRuleDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * SKU资产发放规则 Service 接口
 *
 * @author ci-codegen
 */
public interface SkuGrantRuleService {

    /**
     * 创建SKU资产发放规则
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createSkuGrantRule(@Valid SkuGrantRuleSaveReqVO createReqVO);

    /**
     * 更新SKU资产发放规则
     *
     * @param updateReqVO 更新信息
     */
    void updateSkuGrantRule(@Valid SkuGrantRuleSaveReqVO updateReqVO);

    /**
     * 删除SKU资产发放规则
     *
     * @param id 编号
     */
    void deleteSkuGrantRule(Long id);

    /**
    * 批量删除SKU资产发放规则
    *
    * @param ids 编号
    */
    void deleteSkuGrantRuleListByIds(List<Long> ids);

    /**
     * 获得SKU资产发放规则
     *
     * @param id 编号
     * @return SKU资产发放规则
     */
    SkuGrantRuleDO getSkuGrantRule(Long id);

    /**
     * 获得SKU资产发放规则分页
     *
     * @param pageReqVO 分页查询
     * @return SKU资产发放规则分页
     */
    PageResult<SkuGrantRuleDO> getSkuGrantRulePage(SkuGrantRulePageReqVO pageReqVO);

}