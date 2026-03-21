package cn.iocoder.yudao.module.asset.service.usagerecord;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.asset.controller.admin.usagerecord.vo.*;
import cn.iocoder.yudao.module.asset.dal.dataobject.usagerecord.UsageRecordDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 资产使用记录 Service 接口
 *
 * @author ci-codegen
 */
public interface UsageRecordService {

    /**
     * 创建资产使用记录
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createUsageRecord(@Valid UsageRecordSaveReqVO createReqVO);

    /**
     * 更新资产使用记录
     *
     * @param updateReqVO 更新信息
     */
    void updateUsageRecord(@Valid UsageRecordSaveReqVO updateReqVO);

    /**
     * 删除资产使用记录
     *
     * @param id 编号
     */
    void deleteUsageRecord(Long id);

    /**
    * 批量删除资产使用记录
    *
    * @param ids 编号
    */
    void deleteUsageRecordListByIds(List<Long> ids);

    /**
     * 获得资产使用记录
     *
     * @param id 编号
     * @return 资产使用记录
     */
    UsageRecordDO getUsageRecord(Long id);

    /**
     * 获得资产使用记录分页
     *
     * @param pageReqVO 分页查询
     * @return 资产使用记录分页
     */
    PageResult<UsageRecordDO> getUsageRecordPage(UsageRecordPageReqVO pageReqVO);

}