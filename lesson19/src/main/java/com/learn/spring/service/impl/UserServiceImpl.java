package com.learn.spring.service.impl;

import com.learn.spring.bean.Account;
import com.learn.spring.dao.AccountDao;
import com.learn.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transMoney(Integer fromId, Integer toId, Integer money) {
        Account fromAccount = accountDao.findAccountById(fromId);
        Account toAccount = accountDao.findAccountById(toId);
        //原始账号减钱
        fromAccount.setMoney(fromAccount.getMoney() - money);
        accountDao.updateAccount(fromAccount);
        //抛出异常
        //int i = 1 / 0;
        //转账账号加钱
        toAccount.setMoney(toAccount.getMoney() + money);
        accountDao.updateAccount(toAccount);
    }
}
