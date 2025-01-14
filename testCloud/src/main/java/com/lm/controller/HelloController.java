package com.lm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ming.li
 * @Date 2025/1/14 17:13
 * @Version 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String getHello(){
        return "hello world";
    }
}
