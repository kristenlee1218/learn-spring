package com.learn.spring.bean;

/**
 * @author kristen
 */
public class User {
    private static User user = new User();

    private User() {
    }

    public static User createUserInstance() {
        System.out.println("createUserInstance");
        return null;
    }
}