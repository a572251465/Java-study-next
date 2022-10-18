package com.example.alibabacloudsentinel02.controller;

import com.example.alibabacloudsentinel02.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DemoService demoService;

    @GetMapping(value = "/testA")
    public String testA() {
        return "visit testA, visit port is " + serverPort;
    }

    @GetMapping(value = "/testB")
    public String testB() {
        return "visit testB, visit port is " + serverPort;
    }

    @GetMapping(value = "/testC")
    public String testC() {
        return demoService.getCommon() + ";testC";
    }

    @GetMapping(value = "/testD")
    public String testD() {
        return demoService.getCommon() + ";testD";
    }
}
