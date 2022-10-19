package com.example.alibabacloudgateway9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaCloudGateWay9001Application {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudGateWay9001Application.class, args);
    }

}
