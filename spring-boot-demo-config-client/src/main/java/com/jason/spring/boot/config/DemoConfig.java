package com.jason.spring.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * demo config
 * date: 2017/7/23 15:39
 *
 * @author Jason
 */
@Component
@ConfigurationProperties(prefix = "demo")
public class DemoConfig {
    private String name;
    private String user;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
