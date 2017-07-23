package com.jason.spring.boot;

import com.jason.spring.boot.config.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SpringBootDemoApplicationTests {

    @Autowired
    Config config;

    @Test
    public void contextLoads() {
        System.out.println(config.name);
    }

}
