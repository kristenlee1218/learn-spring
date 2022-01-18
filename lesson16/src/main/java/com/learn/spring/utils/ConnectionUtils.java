package com.learn.spring.utils;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :
 */
public class ConnectionUtils {
    private final ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public Connection getThreadConnection() {
        try {
            Connection conn = tl.get();
            if (conn == null) {
                conn = dataSource.getConnection();
                conn.setAutoCommit(false);
                tl.set(conn);
            }
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void removeConnection() {
        tl.remove();
    }
}
