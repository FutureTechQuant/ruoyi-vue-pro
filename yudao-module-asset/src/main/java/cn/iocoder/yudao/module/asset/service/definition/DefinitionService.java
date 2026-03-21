package cn.iocoder.yudao.module.asset.service.definition;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.asset.controller.admin.definition.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.definition.DefinitionDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 资产定义 Service 接口
 *
 * @author ci-codegen
 */
public interface DefinitionService {

    /**
     * 创建资产定义
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createDefinition(@Valid DefinitionSaveReqVO createReqVO);

    /**
     * 更新资产定义
     *
     * @param updateReqVO 更新信息
     */
    void updateDefinition(@Valid DefinitionSaveReqVO updateReqVO);

    /**
     * 删除资产定义
     *
     * @param id 编号
     */
    void deleteDefinition(Long id);

    /**
    * 批量删除资产定义
    *
    * @param ids 编号
    */
    void deleteDefinitionListByIds(List<Long> ids);

    /**
     * 获得资产定义
     *
     * @param id 编号
     * @return 资产定义
     */
    DefinitionDO getDefinition(Long id);

    /**
     * 获得资产定义分页
     *
     * @param pageReqVO 分页查询
     * @return 资产定义分页
     */
    PageResult<DefinitionDO> getDefinitionPage(DefinitionPageReqVO pageReqVO);

}