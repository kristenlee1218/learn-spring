package com.learn.spring.dao;

import com.learn.spring.bean.Account;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :
 */
public interface AccountDao {

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);
}
