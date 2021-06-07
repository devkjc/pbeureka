package com.toy.pbeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PbeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbeurekaApplication.class, args);
    }

}
