package com.jason.spring.boot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * application config
 * date: 2017/7/22 19:28
 *
 * @author Jason
 */
@Component
public class Config {
    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
