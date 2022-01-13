package com.learn.spring.controller;

import org.springframework.stereotype.Controller;

@Controller("uc")
public class UserController {
    public void saveUser() {
        System.out.println("这是controller的执行保存..");
    }
}

