package com.learn.spring;

import com.learn.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :
 */
public class AccountServiceTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ac.getBean(UserService.class);
        userService.transMoney(1, 2, 1000);
        System.out.println("转账完成..");
    }
}
