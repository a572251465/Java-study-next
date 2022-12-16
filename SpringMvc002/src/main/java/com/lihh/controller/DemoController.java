package com.lihh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo")
@Controller
public class DemoController {

    @RequestMapping(value = "/testDemo")
    public String testDemo() {
        return "demo";
    }
}
