package com.sicnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class LixiaoCommonsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LixiaoCommonsApplication.class, args);
    }

    //加密密码
    @Bean
    public BCryptPasswordEncoder createPasswordEncoder(){
        //不加盐值，直接用它默认的
        return new BCryptPasswordEncoder();
    }
}
