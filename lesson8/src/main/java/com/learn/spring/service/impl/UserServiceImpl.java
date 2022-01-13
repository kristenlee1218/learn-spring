package com.learn.spring.service.impl;

import com.learn.spring.dao.UserDao;
import com.learn.spring.service.UserService;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void deleteById(Integer id) {
        System.out.println("删除的方法执行");
    }
}
