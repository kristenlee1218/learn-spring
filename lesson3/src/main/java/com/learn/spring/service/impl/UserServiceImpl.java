package com.learn.spring.service.impl;

import com.learn.spring.service.UserService;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :
 */
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser() {
        System.out.println("service 的 save() 执行了");
    }
}