package com.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :
 */
public class DemoTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
    }
}