package com.lihh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Integer count = 0;

    @RequestMapping(value = "/helllo")
    public String hello() {
        return "hello，这是我们第" + (count++) + "打招呼";
    }
}
