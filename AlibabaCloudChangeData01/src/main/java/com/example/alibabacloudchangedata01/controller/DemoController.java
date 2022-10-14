package com.example.alibabacloudchangedata01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/visit")
    public String visit() {
        return "server setup successfully, port is:" + serverPort + "配置信息是：" + configInfo;
    }
}
