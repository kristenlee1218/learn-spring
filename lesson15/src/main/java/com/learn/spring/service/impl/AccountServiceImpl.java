package com.learn.spring.service.impl;

import com.learn.spring.bean.Account;
import com.learn.spring.dao.AccountDao;
import com.learn.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : Kristen
 * @date : 2022/1/15
 * @description :
 */
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String sourceAccount, String targetAccount, Integer money) {
        Account source = accountDao.findAccountByNum(sourceAccount);
        Account target = accountDao.findAccountByNum(targetAccount);
        source.setMoney(source.getMoney() - money);
        target.setMoney(target.getMoney() + money);
        accountDao.updateAccount(source);
        accountDao.updateAccount(target);
        System.out.println("转账完毕");
    }
}
