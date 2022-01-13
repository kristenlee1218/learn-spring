package com.learn.spring.proxy;

import com.learn.spring.service.UserService;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
public class UserServiceProxy implements UserService {
    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void saveUser() {
        System.out.println("原始功能执行之前的逻辑代码");
        userService.saveUser();
        ;
        System.out.println("原始功能执行之后的逻辑代码");
    }
}
