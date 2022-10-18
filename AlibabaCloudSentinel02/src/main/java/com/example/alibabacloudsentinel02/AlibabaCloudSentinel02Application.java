package com.example.alibabacloudsentinel02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaCloudSentinel02Application {

	public static void main(String[] args) {
		SpringApplication.run(AlibabaCloudSentinel02Application.class, args);
	}

}
