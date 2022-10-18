package com.example.alibabacloudsentinel01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/testA")
    public String testA() {
        return "testA";
    }

    @GetMapping(value = "/testB")
    public String testB() {
        return "testB";
    }
}
