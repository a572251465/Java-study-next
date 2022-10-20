package com.lihh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/getInfo")
    public String getInfo(String params) {
        return params + "getInfo";
    }
}
