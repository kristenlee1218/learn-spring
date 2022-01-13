package com.learn.spring.dao.impl;

import org.springframework.stereotype.Repository;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
@Repository
public class UserDaoImpl {
    public void saveUser() {
        System.out.println("执行dao的保存方法");
    }
}
