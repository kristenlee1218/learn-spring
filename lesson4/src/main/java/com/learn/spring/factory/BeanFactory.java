package com.learn.spring.factory;

import com.learn.spring.bean.User;

/**
 * @author kristen
 */
public class BeanFactory {
    private static User user1 = new User();
    private static User user2 = new User();

    public User createUser1() {
        return user1;
    }

    public User createUser2() {
        return user2;
    }
}