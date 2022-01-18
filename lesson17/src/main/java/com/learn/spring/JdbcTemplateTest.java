package com.learn.spring;

import com.learn.spring.bean.Account;
import com.learn.spring.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :
 */
public class JdbcTemplateTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = ac.getBean(AccountDao.class);
        Account account = accountDao.findAccountById(1);
        System.out.println(account);
        account.setMoney(2000f);
        accountDao.updateAccount(account);
        System.out.println("账号更改成功");
    }
}
