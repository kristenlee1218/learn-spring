package com.learn.spring.controller;

import org.springframework.stereotype.Controller;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
@Controller("uc")
public class UserController {
    public void saveUser() {
        System.out.println("这是controller的执行保存..");
    }
}

