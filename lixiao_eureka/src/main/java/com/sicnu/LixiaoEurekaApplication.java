package com.sicnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LixiaoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LixiaoEurekaApplication.class, args);
    }

}
