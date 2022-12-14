package com.example.alibabacloud9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaCloud9001Application {

	public static void main(String[] args) {
		SpringApplication.run(AlibabaCloud9001Application.class, args);
	}

}
