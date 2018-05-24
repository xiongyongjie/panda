package com.springcloud.eurakeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启eurekaserver
@EnableEurekaServer
public class EurakeserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakeserverApplication.class, args);
    }
    
}
