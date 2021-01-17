package com.sicnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient //表示为一个eureka客户端
@EnableFeignClients
public class LixiaosysCardApplication {

    public static void main(String[] args) {
        SpringApplication.run(LixiaosysCardApplication.class, args);
    }

}
