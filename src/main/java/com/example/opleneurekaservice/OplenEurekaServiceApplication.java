package com.example.opleneurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class OplenEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OplenEurekaServiceApplication.class, args);
    }

}
