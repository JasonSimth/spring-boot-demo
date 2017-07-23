package com.jason.spring.boot.rest;

import com.jason.spring.boot.config.Config;
import com.jason.spring.boot.vo.ParamVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * demo rest
 * date: 2017/7/22 19:27
 *
 * @author Jason
 */
@RestController
@RequestMapping("/demo")
public class DemoRestController {
    @Autowired
    Config config;

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpServletResponse response;

    @RequestMapping(value = {"", "/"})
    public String demo() {
        return "Hello World";
    }

    @RequestMapping("/1")
    public String one() {
        return "path:" + request.getRequestURL().toString();
    }

    @RequestMapping("/name")
    public String name() {
        return "config:name=" + config.getName();
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get2(@RequestParam(defaultValue = "default") String name) {
        return "path:" + request.getRequestURL().toString() + " param:name=" + name;
    }

    @RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
    public String get3(@PathVariable String name) {
        return "path:" + request.getRequestURL().toString() + "path param:name=" + name;
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String post(String name) {
        return "path:" + request.getRequestURL().toString() + "param:name=" + name;
    }

    @RequestMapping(value = "/post2", method = RequestMethod.POST)
    public ParamVO post2(@RequestBody ParamVO param) {
        return param;
    }

}
