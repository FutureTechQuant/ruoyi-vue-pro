package cn.iocoder.yudao.module.asset.service.useraccount;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.asset.controller.admin.useraccount.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccount.UserAccountDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 用户资产账户 Service 接口
 *
 * @author ci-codegen
 */
public interface UserAccountService {

    /**
     * 创建用户资产账户
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createUserAccount(@Valid UserAccountSaveReqVO createReqVO);

    /**
     * 更新用户资产账户
     *
     * @param updateReqVO 更新信息
     */
    void updateUserAccount(@Valid UserAccountSaveReqVO updateReqVO);

    /**
     * 删除用户资产账户
     *
     * @param id 编号
     */
    void deleteUserAccount(Long id);

    /**
    * 批量删除用户资产账户
    *
    * @param ids 编号
    */
    void deleteUserAccountListByIds(List<Long> ids);

    /**
     * 获得用户资产账户
     *
     * @param id 编号
     * @return 用户资产账户
     */
    UserAccountDO getUserAccount(Long id);

    /**
     * 获得用户资产账户分页
     *
     * @param pageReqVO 分页查询
     * @return 用户资产账户分页
     */
    PageResult<UserAccountDO> getUserAccountPage(UserAccountPageReqVO pageReqVO);

}