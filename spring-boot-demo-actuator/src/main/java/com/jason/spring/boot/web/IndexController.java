package com.jason.spring.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * index controller
 * date: 2017/7/22 22:27
 *
 * @author Jason
 */
@Controller
public class IndexController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpSession session;

    @Autowired
    HttpServletResponse response;

    @RequestMapping(value = {"", "/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = {"/a"})
    public String demoIndex() {
        return "redirect:demo/index";
    }

    @RequestMapping("/hello")
    public String hello(String name, Map<String, Object> map) {
        map.put("hello", "from IndexController.hello()");
        session.setAttribute("name", name);
        return "hello";
    }

}
