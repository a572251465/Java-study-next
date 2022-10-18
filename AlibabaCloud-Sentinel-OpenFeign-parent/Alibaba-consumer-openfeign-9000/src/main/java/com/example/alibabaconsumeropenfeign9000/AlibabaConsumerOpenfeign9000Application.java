package com.example.alibabaconsumeropenfeign9000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AlibabaConsumerOpenfeign9000Application {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaConsumerOpenfeign9000Application.class, args);
    }

}
