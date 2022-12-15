package com.lihh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/firstController.do")
    public String firstController() {
        return "/first.jsp";
    }
}
