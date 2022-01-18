package com.learn.spring.dao.impl;

import com.learn.spring.bean.Account;
import com.learn.spring.dao.AccountDao;
import com.learn.spring.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :
 */
public class AccountDaoImpl implements AccountDao {
    private QueryRunner runner;
    private ConnectionUtils connectionUtils;

    public QueryRunner getRunner() {
        return runner;
    }

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public ConnectionUtils getConnectionUtils() {
        return connectionUtils;
    }

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    @Override
    public void updateAccount(Account account) {
        try {
            runner.update(connectionUtils.getThreadConnection(), "update account set accountNum=?,money=? where id=?", account.getAccountNum(), account.getMoney(), account.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account findAccountByNum(String accountNum) {
        try {
            List<Account> accounts = runner.query(connectionUtils.getThreadConnection(), "select * from account where accountNum = ? ", new BeanListHandler<Account>(Account.class), accountNum);
            if (accounts == null || accounts.size() == 0) {
                return null;
            }
            if (accounts.size() > 1) {
                throw new RuntimeException("结果集不唯一，数据有问题");
            }
            return accounts.get(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}