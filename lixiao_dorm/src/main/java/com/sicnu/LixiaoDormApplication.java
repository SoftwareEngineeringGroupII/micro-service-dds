package com.sicnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LixiaoDormApplication {

    public static void main(String[] args) {
        SpringApplication.run(LixiaoDormApplication.class, args);
    }

}
