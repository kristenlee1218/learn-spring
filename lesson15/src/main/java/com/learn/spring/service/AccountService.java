package com.learn.spring.service;

/**
 * @author : Kristen
 * @date : 2022/1/15
 * @description :
 */
public interface AccountService {
    void transfer(String sourceAccount, String targetAccount, Integer money);
}
