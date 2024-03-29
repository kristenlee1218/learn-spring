package com.learn.spring.bean;

import java.io.Serializable;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :
 */
public class Account implements Serializable {
    private Integer id;
    private String accountNum;
    private Float money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}