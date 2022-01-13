package com.learn.spring.service.impl;

import com.learn.spring.dao.UserDao;
import com.learn.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
@Service
public class UserServiceImpl implements UserService {
    //    @Autowired
//    private UserDao userDao;
    @Qualifier("userDaoImpl1")
    @Autowired
    private UserDao userDao;

    public void saveUser() {
        System.out.println("执行service中的保存逻辑");
        userDao.saveUser();
    }
}
