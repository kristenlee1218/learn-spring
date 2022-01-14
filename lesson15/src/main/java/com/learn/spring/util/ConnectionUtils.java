package com.learn.spring.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :
 */
public class ConnectionUtils {
    private static String URL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";
    private static String USER = "root";
    private static String PASSWORD = "123456";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDataSource(ComboPooledDataSource dataSource) {
    }
}
