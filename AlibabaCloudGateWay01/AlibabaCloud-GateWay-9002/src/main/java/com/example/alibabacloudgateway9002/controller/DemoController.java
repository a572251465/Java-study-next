package com.example.alibabacloudgateway9002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lihh/ceo")
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/info")
    public String getInfo() {
        return "此时访问的端口是：" + serverPort;
    }
}
