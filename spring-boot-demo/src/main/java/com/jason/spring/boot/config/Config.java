package com.jason.spring.boot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * config
 * date: 2017/7/22 18:29
 *
 * @author Jason
 */
@Component
public class Config {
    @Value("${name}")
    public String name;

    @Value("${a.name}")
    public String a_name;
}
