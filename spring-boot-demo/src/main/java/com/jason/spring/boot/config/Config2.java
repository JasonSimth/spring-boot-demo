package com.jason.spring.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * auto config
 * date: 2017/7/22 18:58
 *
 * @author Jason
 */
@Component
@ConfigurationProperties
public class Config2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
