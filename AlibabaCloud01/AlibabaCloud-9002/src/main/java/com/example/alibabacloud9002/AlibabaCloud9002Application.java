package com.example.alibabacloud9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaCloud9002Application {

	public static void main(String[] args) {
		SpringApplication.run(AlibabaCloud9002Application.class, args);
	}

}
