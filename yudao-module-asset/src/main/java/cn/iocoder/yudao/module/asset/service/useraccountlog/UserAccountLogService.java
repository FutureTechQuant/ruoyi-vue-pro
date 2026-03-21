package cn.iocoder.yudao.module.asset.service.useraccountlog;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.asset.controller.admin.useraccountlog.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.useraccountlog.UserAccountLogDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 用户资产账户流水 Service 接口
 *
 * @author ci-codegen
 */
public interface UserAccountLogService {

    /**
     * 创建用户资产账户流水
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createUserAccountLog(@Valid UserAccountLogSaveReqVO createReqVO);

    /**
     * 更新用户资产账户流水
     *
     * @param updateReqVO 更新信息
     */
    void updateUserAccountLog(@Valid UserAccountLogSaveReqVO updateReqVO);

    /**
     * 删除用户资产账户流水
     *
     * @param id 编号
     */
    void deleteUserAccountLog(Long id);

    /**
    * 批量删除用户资产账户流水
    *
    * @param ids 编号
    */
    void deleteUserAccountLogListByIds(List<Long> ids);

    /**
     * 获得用户资产账户流水
     *
     * @param id 编号
     * @return 用户资产账户流水
     */
    UserAccountLogDO getUserAccountLog(Long id);

    /**
     * 获得用户资产账户流水分页
     *
     * @param pageReqVO 分页查询
     * @return 用户资产账户流水分页
     */
    PageResult<UserAccountLogDO> getUserAccountLogPage(UserAccountLogPageReqVO pageReqVO);

}