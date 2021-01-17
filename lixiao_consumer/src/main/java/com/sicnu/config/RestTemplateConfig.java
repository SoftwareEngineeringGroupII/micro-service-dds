package com.sicnu.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//表明是配置类，类似spring boot全局配置文件
@Configuration
public class RestTemplateConfig {

    //向spring容器中注入一个bean
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplte(){
        return new RestTemplate();
    }
}
