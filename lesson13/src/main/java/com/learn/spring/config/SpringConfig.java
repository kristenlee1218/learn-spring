package com.learn.spring.config;

import com.learn.spring.service.UserService;
import com.learn.spring.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
@Configuration
public class SpringConfig {
    @Bean
    public UserService newUserServiceImpl() {
        return new UserServiceImpl();
    }
}