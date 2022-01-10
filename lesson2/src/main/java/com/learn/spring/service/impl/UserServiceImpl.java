package com.learn.spring.service.impl;

import com.learn.spring.service.UserService;

/**
 * @author kristen
 */
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser() {
        System.out.println("service 的 save() 执行了");
    }
}