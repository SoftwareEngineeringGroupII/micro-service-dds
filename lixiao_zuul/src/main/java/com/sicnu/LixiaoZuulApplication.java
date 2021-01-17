package com.sicnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableZuulProxy //开启网关服务
@EnableFeignClients
@EnableEurekaClient
public class LixiaoZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(LixiaoZuulApplication.class, args);
    }

}
