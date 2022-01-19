package com.learn.spring.dao.impl;

import com.learn.spring.bean.Account;
import com.learn.spring.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :
 */

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account findAccountById(Integer accountId) {
        List<Account> accounts = jdbcTemplate.query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), accountId);
        return accounts.isEmpty() ? null : accounts.get(0);
    }

    @Override
    public void saveAccount(Account account) {
        jdbcTemplate.update("insert into account  values(?,?,?)",
                account.getId(), account.getAccountNum(), account.getMoney());
    }

    @Override
    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set accountnum=?,money=? where id=?", account.getAccountNum(), account.getMoney(), account.getId());
    }
}
