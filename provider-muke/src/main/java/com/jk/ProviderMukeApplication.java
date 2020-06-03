package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProviderMukeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderMukeApplication.class, args);
    }

}
