package com.jason.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringBootDemoJettyApplication {

    @RequestMapping(value = {"", "/", "/index"})
    public String index() {
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoJettyApplication.class, args);
    }

}
