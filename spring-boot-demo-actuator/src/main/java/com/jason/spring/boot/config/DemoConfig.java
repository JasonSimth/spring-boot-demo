package com.jason.spring.boot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * demo config
 * date: 2017/7/22 22:29
 *
 * @author Jason
 */
@Component
public class DemoConfig {
    @Value("${demo.user}")
    private String user;

    @Value("${demo.password}")
    private String name;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
