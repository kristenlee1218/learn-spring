package com.learn.spring.service.impl;

import com.learn.spring.bean.Account;
import com.learn.spring.dao.AccountDao;
import com.learn.spring.dao.impl.AccountDaoImpl;
import com.learn.spring.service.AccountService;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setAccountDao(AccountDaoImpl accountDao) {
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