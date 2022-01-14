package com.learn.spring.service.impl;

import com.learn.spring.bean.Account;
import com.learn.spring.dao.AccountDao;
import com.learn.spring.service.AccountService;

/**
 * @author : Kristen
 * @date : 2022/1/14
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

    //转账的方法
    @Override
    public void transfer(String sourceAccount, String targetAccount, Integer money) {
        //查询原始账户
        Account source = accountDao.findAccountByNum(sourceAccount);
        //查询目标账户
        Account target = accountDao.findAccountByNum(targetAccount);
        //原始账号减钱
        source.setMoney(source.getMoney() - money);
        //目标账号加钱
        target.setMoney(target.getMoney() + money);
        //更新原始账号
        accountDao.updateAccount(source);
        //更新目标账号
        accountDao.updateAccount(target);
        System.out.println("转账完毕");
    }
}

