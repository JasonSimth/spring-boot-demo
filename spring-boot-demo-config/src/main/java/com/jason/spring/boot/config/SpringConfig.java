package com.jason.spring.boot.config;

import com.jason.spring.boot.vo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description
 * date: 2017/7/22 23:58
 *
 * @author Jason
 */
@Configuration
public class SpringConfig {
    @Bean
    public User getUser() {
        User user = new User();
        user.setName("spring config");
        user.setPassword("spring config");
        return user;
    }
}
