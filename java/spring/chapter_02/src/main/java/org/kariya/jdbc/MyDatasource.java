package org.kariya.jdbc;

import lombok.extern.slf4j.Slf4j;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/21 10:47
 */
@Slf4j
public class MyDatasource implements DataSource {
    private String driver;
    private String username;
    private String password;
    private String url;
    
    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }
    
    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }
    
    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }
    
    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
    
    }
    
    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
    
    }
    
    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }
    
    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
    
    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }
    
    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
    
    @Override
    public String toString() {
        return "MyDatasource{" +
                "driver='" + driver + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
