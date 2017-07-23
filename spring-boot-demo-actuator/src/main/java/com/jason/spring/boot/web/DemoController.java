package com.jason.spring.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description
 * date: 2017/7/22 22:42
 *
 * @author Jason
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping(value = {"", "/", "/index"})
    public String demo() {
        return "demo/index";
    }

}
