package cn.iocoder.yudao.module.asset.service.useraccountsource;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.asset.controller.admin.useraccountsource.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccountsource.UserAccountSourceDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 用户资产来源 Service 接口
 *
 * @author ci-codegen
 */
public interface UserAccountSourceService {

    /**
     * 创建用户资产来源
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createUserAccountSource(@Valid UserAccountSourceSaveReqVO createReqVO);

    /**
     * 更新用户资产来源
     *
     * @param updateReqVO 更新信息
     */
    void updateUserAccountSource(@Valid UserAccountSourceSaveReqVO updateReqVO);

    /**
     * 删除用户资产来源
     *
     * @param id 编号
     */
    void deleteUserAccountSource(Long id);

    /**
    * 批量删除用户资产来源
    *
    * @param ids 编号
    */
    void deleteUserAccountSourceListByIds(List<Long> ids);

    /**
     * 获得用户资产来源
     *
     * @param id 编号
     * @return 用户资产来源
     */
    UserAccountSourceDO getUserAccountSource(Long id);

    /**
     * 获得用户资产来源分页
     *
     * @param pageReqVO 分页查询
     * @return 用户资产来源分页
     */
    PageResult<UserAccountSourceDO> getUserAccountSourcePage(UserAccountSourcePageReqVO pageReqVO);

}