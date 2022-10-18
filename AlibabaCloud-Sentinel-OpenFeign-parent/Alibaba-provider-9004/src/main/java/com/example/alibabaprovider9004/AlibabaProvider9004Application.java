package com.example.alibabaprovider9004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaProvider9004Application {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaProvider9004Application.class, args);
    }

}
