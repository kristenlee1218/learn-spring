package com.learn.spring.dao;

import com.learn.spring.bean.Account;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :
 */
public interface AccountDao {

    void updateAccount(Account account);

    Account findAccountByNum(String accountNum);
}



