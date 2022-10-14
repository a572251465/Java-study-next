package com.example.alibabacloudchangedata01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaCloudChangeData01Application {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudChangeData01Application.class, args);
    }

}
