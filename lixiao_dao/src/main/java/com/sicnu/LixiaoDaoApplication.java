package com.sicnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LixiaoDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LixiaoDaoApplication.class, args);
    }

}
