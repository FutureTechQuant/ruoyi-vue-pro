package cn.iocoder.yudao.module.asset.service.useraccountlog;

import cn.hutool.core.collection.CollUtil;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.asset.controller.admin.useraccountlog.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccountlog.UserAccountLogDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.asset.dal.mysql.useraccountlog.UserAccountLogMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
import static cn.iocoder.yudao.module.asset.enums.ErrorCodeConstants.*;

/**
 * 用户资产账户流水 Service 实现类
 *
 * @author ci-codegen
 */
@Service
@Validated
public class UserAccountLogServiceImpl implements UserAccountLogService {

    @Resource
    private UserAccountLogMapper userAccountLogMapper;

    @Override
    public Long createUserAccountLog(UserAccountLogSaveReqVO createReqVO) {
        // 插入
        UserAccountLogDO userAccountLog = BeanUtils.toBean(createReqVO, UserAccountLogDO.class);
        userAccountLogMapper.insert(userAccountLog);

        // 返回
        return userAccountLog.getId();
    }

    @Override
    public void updateUserAccountLog(UserAccountLogSaveReqVO updateReqVO) {
        // 校验存在
        validateUserAccountLogExists(updateReqVO.getId());
        // 更新
        UserAccountLogDO updateObj = BeanUtils.toBean(updateReqVO, UserAccountLogDO.class);
        userAccountLogMapper.updateById(updateObj);
    }

    @Override
    public void deleteUserAccountLog(Long id) {
        // 校验存在
        validateUserAccountLogExists(id);
        // 删除
        userAccountLogMapper.deleteById(id);
    }

    @Override
        public void deleteUserAccountLogListByIds(List<Long> ids) {
        // 删除
        userAccountLogMapper.deleteByIds(ids);
        }


    private void validateUserAccountLogExists(Long id) {
        if (userAccountLogMapper.selectById(id) == null) {
            throw exception(USER_ACCOUNT_LOG_NOT_EXISTS);
        }
    }

    @Override
    public UserAccountLogDO getUserAccountLog(Long id) {
        return userAccountLogMapper.selectById(id);
    }

    @Override
    public PageResult<UserAccountLogDO> getUserAccountLogPage(UserAccountLogPageReqVO pageReqVO) {
        return userAccountLogMapper.selectPage(pageReqVO);
    }

}