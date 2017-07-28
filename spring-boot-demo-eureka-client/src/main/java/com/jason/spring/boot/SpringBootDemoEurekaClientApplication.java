package com.jason.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RestController
@Component
public class SpringBootDemoEurekaClientApplication {

    @Value("${server.port}")
    String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping(value = {"", "/", "/index"})
    public String index() {
        return "server.port:" + serverPort;
    }

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return discoveryClient.getInstances(applicationName);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoEurekaClientApplication.class, args);
    }
}
