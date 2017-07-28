package com.jason.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootDemoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoEurekaServerApplication.class, args);
	}
}
