package com.learn.spring.dao.impl;

import com.learn.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("执行dao的保存方法");
    }
}