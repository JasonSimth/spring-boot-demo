package com.jason.spring.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * demo config
 * date: 2017/7/22 22:29
 *
 * @author Jason
 */
@Component
@ConfigurationProperties(prefix = "demo")
public class DemoConfig {
    private String user;
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
