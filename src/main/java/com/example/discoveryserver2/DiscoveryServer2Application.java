package com.example.discoveryserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServer2Application.class, args);
    }

}
