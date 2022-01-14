package com.learn.spring.dao;

import com.learn.spring.bean.Account;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :
 */
public interface AccountDao {
    /**
     * 更新
     *
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 根据编号查询账户
     *
     * @param accountNum
     * @return 如果有唯一的一个结果就返回，如果没有结果就返回null
     * 如果结果集超过一个就抛异常
     */
    Account findAccountByNum(String accountNum);
}
