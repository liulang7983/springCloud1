package com.lm.configuration;

import com.lm.dto.Aliyun;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Author ming.li
 * @Date 2025/1/14 19:44
 * @Version 1.0
 */
@SpringBootConfiguration
public class BootConfiguration {
    @Value("${appKey}")
    private String appKey;
    @Value("${appSecret}")
    private String appSecret;
    @Value("${bucket}")
    private String bucket;
    @Value("${endPoint}")
    private String endPoint;

    @Bean
    public Aliyun aliyun(){
        return Aliyun.options()
                .setAppKey(appKey)
                .setAppSecret(appSecret)
                .setBucket(bucket)
                .setEndPoint(endPoint)
                .build();
    }
}
