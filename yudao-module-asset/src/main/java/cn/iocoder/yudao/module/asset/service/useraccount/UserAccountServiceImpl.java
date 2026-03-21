package cn.iocoder.yudao.module.asset.service.useraccount;

import cn.hutool.core.collection.CollUtil;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.asset.controller.admin.useraccount.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccount.UserAccountDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.asset.dal.mysql.useraccount.UserAccountMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
import static cn.iocoder.yudao.module.asset.enums.ErrorCodeConstants.*;

/**
 * 用户资产账户 Service 实现类
 *
 * @author ci-codegen
 */
@Service
@Validated
public class UserAccountServiceImpl implements UserAccountService {

    @Resource
    private UserAccountMapper userAccountMapper;

    @Override
    public Long createUserAccount(UserAccountSaveReqVO createReqVO) {
        // 插入
        UserAccountDO userAccount = BeanUtils.toBean(createReqVO, UserAccountDO.class);
        userAccountMapper.insert(userAccount);

        // 返回
        return userAccount.getId();
    }

    @Override
    public void updateUserAccount(UserAccountSaveReqVO updateReqVO) {
        // 校验存在
        validateUserAccountExists(updateReqVO.getId());
        // 更新
        UserAccountDO updateObj = BeanUtils.toBean(updateReqVO, UserAccountDO.class);
        userAccountMapper.updateById(updateObj);
    }

    @Override
    public void deleteUserAccount(Long id) {
        // 校验存在
        validateUserAccountExists(id);
        // 删除
        userAccountMapper.deleteById(id);
    }

    @Override
        public void deleteUserAccountListByIds(List<Long> ids) {
        // 删除
        userAccountMapper.deleteByIds(ids);
        }


    private void validateUserAccountExists(Long id) {
        if (userAccountMapper.selectById(id) == null) {
            throw exception(USER_ACCOUNT_NOT_EXISTS);
        }
    }

    @Override
    public UserAccountDO getUserAccount(Long id) {
        return userAccountMapper.selectById(id);
    }

    @Override
    public PageResult<UserAccountDO> getUserAccountPage(UserAccountPageReqVO pageReqVO) {
        return userAccountMapper.selectPage(pageReqVO);
    }

}