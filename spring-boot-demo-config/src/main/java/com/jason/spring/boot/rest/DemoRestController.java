package com.jason.spring.boot.rest;

import com.jason.spring.boot.config.DemoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo restful
 * date: 2017/7/22 22:30
 *
 * @author Jason
 */
@RestController
@RequestMapping("/demo")
public class DemoRestController {

    @Autowired
    DemoConfig demoConfig;

    @RequestMapping(value = "/getDemoConfig", method = {RequestMethod.GET, RequestMethod.POST})
    public DemoConfig getDemoConfig() {
        return demoConfig;
    }
}
