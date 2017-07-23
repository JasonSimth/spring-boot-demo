package com.jason.spring.boot.rest;

import com.jason.spring.boot.config.DemoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * demo restful
 * date: 2017/7/23 15:40
 *
 * @author Jason
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    DemoConfig demoConfig;

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpServletResponse response;

    @RequestMapping("/config")
    public DemoConfig getDemoConfig() {
        return demoConfig;
    }
}
