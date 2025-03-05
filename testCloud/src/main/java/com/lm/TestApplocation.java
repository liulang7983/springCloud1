package com.lm;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ming.li
 * @Date 2025/1/14 17:13
 * @Version 1.0
 */
@SpringBootApplication
public class TestApplocation {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(TestApplocation.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
