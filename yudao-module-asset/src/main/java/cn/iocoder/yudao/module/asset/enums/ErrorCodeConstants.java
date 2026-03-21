package cn.iocoder.yudao.module.asset.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * 所有自动生成错误码汇总（临时编号）
 * 请按模块规划正式号段后，复制到 ErrorCodeConstants
 */
public interface ErrorCodeConstants {

    // ========== Definition 表错误码 ==========
    ErrorCode DEFINITION_NOT_EXISTS =
    new ErrorCode(1_999_000_000, "资产定义不存在");


    // ========== SkuGrantRule 表错误码 ==========
    ErrorCode SKU_GRANT_RULE_NOT_EXISTS =
    new ErrorCode(1_999_000_000, "SKU资产发放规则不存在");


    // ========== UsageRecord 表错误码 ==========
    ErrorCode USAGE_RECORD_NOT_EXISTS =
    new ErrorCode(1_999_000_000, "资产使用记录不存在");


    // ========== UserAccount 表错误码 ==========
    ErrorCode USER_ACCOUNT_NOT_EXISTS =
    new ErrorCode(1_999_000_000, "用户资产账户不存在");


    // ========== UserAccountLog 表错误码 ==========
    ErrorCode USER_ACCOUNT_LOG_NOT_EXISTS =
    new ErrorCode(1_999_000_000, "用户资产账户流水不存在");


    // ========== UserAccountSource 表错误码 ==========
    ErrorCode USER_ACCOUNT_SOURCE_NOT_EXISTS =
    new ErrorCode(1_999_000_000, "用户资产来源不存在");


}
