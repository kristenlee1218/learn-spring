package com.learn.spring.bean;

/**
 * @author kristen
 */
public class User {
    public User() {
        System.out.println("我被 spring 实例化了");
    }

    public void initMethod() {
        System.out.println("user 类实例化时候执行的代码");
    }

    public void destroyMethod() {
        System.out.println("user 类实例被销毁时候执行的代码");
    }
}