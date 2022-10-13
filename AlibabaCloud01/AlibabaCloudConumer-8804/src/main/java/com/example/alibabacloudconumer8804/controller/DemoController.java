package com.example.alibabacloudconumer8804.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/nacos")
    public String getDiscovery() {
        return restTemplate.getForObject(serverURL + "/visit", String.class);
    }
}
