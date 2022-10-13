package com.example.alibabacloud9002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    private String servePort;

    @GetMapping(value = "/visit")
    public String getServerPort() {
        return "hello server:" + servePort;
    }
}
