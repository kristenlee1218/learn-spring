package com.learn.spring.service;

/**
 * @author : Kristen
 * @date : 2022/1/15
 * @description :
 */
public interface AccountService {
    /**
     * 转账
     *
     * @param sourceAccount 转出账户名称
     * @param targetAccount 转入账户名称
     * @param money         转账金额
     */
    void transfer(String sourceAccount, String targetAccount, Integer money);

}
