package com.lm.controller;

import com.lm.dto.Aliyun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ming.li
 * @Date 2025/1/14 17:13
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    public Aliyun aliyun;

    @RequestMapping("/hello")
    public String getHello(){
        return "hello world";
    }

    @RequestMapping("aliyun")
    public String getAliyun(){
        System.out.println("进入方法:getAliyun");
        return aliyun.getAppKey()+":"+aliyun.getAppSecret()+":"+aliyun.getBucket()+":"+aliyun.getEndPoint();
    }
}
