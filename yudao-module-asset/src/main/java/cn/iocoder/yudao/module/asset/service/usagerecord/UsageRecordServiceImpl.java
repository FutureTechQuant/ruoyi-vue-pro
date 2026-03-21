package cn.iocoder.yudao.module.asset.service.usagerecord;

import cn.hutool.core.collection.CollUtil;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.asset.controller.admin.usagerecord.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.usagerecord.UsageRecordDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.asset.dal.mysql.usagerecord.UsageRecordMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
import static cn.iocoder.yudao.module.asset.enums.ErrorCodeConstants.*;

/**
 * 资产使用记录 Service 实现类
 *
 * @author ci-codegen
 */
@Service
@Validated
public class UsageRecordServiceImpl implements UsageRecordService {

    @Resource
    private UsageRecordMapper usageRecordMapper;

    @Override
    public Long createUsageRecord(UsageRecordSaveReqVO createReqVO) {
        // 插入
        UsageRecordDO usageRecord = BeanUtils.toBean(createReqVO, UsageRecordDO.class);
        usageRecordMapper.insert(usageRecord);

        // 返回
        return usageRecord.getId();
    }

    @Override
    public void updateUsageRecord(UsageRecordSaveReqVO updateReqVO) {
        // 校验存在
        validateUsageRecordExists(updateReqVO.getId());
        // 更新
        UsageRecordDO updateObj = BeanUtils.toBean(updateReqVO, UsageRecordDO.class);
        usageRecordMapper.updateById(updateObj);
    }

    @Override
    public void deleteUsageRecord(Long id) {
        // 校验存在
        validateUsageRecordExists(id);
        // 删除
        usageRecordMapper.deleteById(id);
    }

    @Override
        public void deleteUsageRecordListByIds(List<Long> ids) {
        // 删除
        usageRecordMapper.deleteByIds(ids);
        }


    private void validateUsageRecordExists(Long id) {
        if (usageRecordMapper.selectById(id) == null) {
            throw exception(USAGE_RECORD_NOT_EXISTS);
        }
    }

    @Override
    public UsageRecordDO getUsageRecord(Long id) {
        return usageRecordMapper.selectById(id);
    }

    @Override
    public PageResult<UsageRecordDO> getUsageRecordPage(UsageRecordPageReqVO pageReqVO) {
        return usageRecordMapper.selectPage(pageReqVO);
    }

}