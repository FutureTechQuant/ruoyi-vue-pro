package cn.iocoder.yudao.module.asset.service.useraccountsource;

import cn.hutool.core.collection.CollUtil;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.asset.controller.admin.useraccountsource.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccountsource.UserAccountSourceDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.asset.dal.mysql.useraccountsource.UserAccountSourceMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
import static cn.iocoder.yudao.module.asset.enums.ErrorCodeConstants.*;

/**
 * 用户资产来源 Service 实现类
 *
 * @author ci-codegen
 */
@Service
@Validated
public class UserAccountSourceServiceImpl implements UserAccountSourceService {

    @Resource
    private UserAccountSourceMapper userAccountSourceMapper;

    @Override
    public Long createUserAccountSource(UserAccountSourceSaveReqVO createReqVO) {
        // 插入
        UserAccountSourceDO userAccountSource = BeanUtils.toBean(createReqVO, UserAccountSourceDO.class);
        userAccountSourceMapper.insert(userAccountSource);

        // 返回
        return userAccountSource.getId();
    }

    @Override
    public void updateUserAccountSource(UserAccountSourceSaveReqVO updateReqVO) {
        // 校验存在
        validateUserAccountSourceExists(updateReqVO.getId());
        // 更新
        UserAccountSourceDO updateObj = BeanUtils.toBean(updateReqVO, UserAccountSourceDO.class);
        userAccountSourceMapper.updateById(updateObj);
    }

    @Override
    public void deleteUserAccountSource(Long id) {
        // 校验存在
        validateUserAccountSourceExists(id);
        // 删除
        userAccountSourceMapper.deleteById(id);
    }

    @Override
        public void deleteUserAccountSourceListByIds(List<Long> ids) {
        // 删除
        userAccountSourceMapper.deleteByIds(ids);
        }


    private void validateUserAccountSourceExists(Long id) {
        if (userAccountSourceMapper.selectById(id) == null) {
            throw exception(USER_ACCOUNT_SOURCE_NOT_EXISTS);
        }
    }

    @Override
    public UserAccountSourceDO getUserAccountSource(Long id) {
        return userAccountSourceMapper.selectById(id);
    }

    @Override
    public PageResult<UserAccountSourceDO> getUserAccountSourcePage(UserAccountSourcePageReqVO pageReqVO) {
        return userAccountSourceMapper.selectPage(pageReqVO);
    }

}