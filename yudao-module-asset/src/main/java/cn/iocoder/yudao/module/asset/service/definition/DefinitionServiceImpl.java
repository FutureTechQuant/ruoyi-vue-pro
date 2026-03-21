package cn.iocoder.yudao.module.asset.service.definition;

import cn.hutool.core.collection.CollUtil;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.asset.controller.admin.definition.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.definition.DefinitionDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.asset.dal.mysql.definition.DefinitionMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
import static cn.iocoder.yudao.module.asset.enums.ErrorCodeConstants.*;

/**
 * 资产定义 Service 实现类
 *
 * @author ci-codegen
 */
@Service
@Validated
public class DefinitionServiceImpl implements DefinitionService {

    @Resource
    private DefinitionMapper definitionMapper;

    @Override
    public Long createDefinition(DefinitionSaveReqVO createReqVO) {
        // 插入
        DefinitionDO definition = BeanUtils.toBean(createReqVO, DefinitionDO.class);
        definitionMapper.insert(definition);

        // 返回
        return definition.getId();
    }

    @Override
    public void updateDefinition(DefinitionSaveReqVO updateReqVO) {
        // 校验存在
        validateDefinitionExists(updateReqVO.getId());
        // 更新
        DefinitionDO updateObj = BeanUtils.toBean(updateReqVO, DefinitionDO.class);
        definitionMapper.updateById(updateObj);
    }

    @Override
    public void deleteDefinition(Long id) {
        // 校验存在
        validateDefinitionExists(id);
        // 删除
        definitionMapper.deleteById(id);
    }

    @Override
        public void deleteDefinitionListByIds(List<Long> ids) {
        // 删除
        definitionMapper.deleteByIds(ids);
        }


    private void validateDefinitionExists(Long id) {
        if (definitionMapper.selectById(id) == null) {
            throw exception(DEFINITION_NOT_EXISTS);
        }
    }

    @Override
    public DefinitionDO getDefinition(Long id) {
        return definitionMapper.selectById(id);
    }

    @Override
    public PageResult<DefinitionDO> getDefinitionPage(DefinitionPageReqVO pageReqVO) {
        return definitionMapper.selectPage(pageReqVO);
    }

}