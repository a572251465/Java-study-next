package com.lihh.controller;

import com.lihh.pojo.Account;
import com.lihh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/users")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/allUser")
    public List<Account> allUser() {
        List<Account> info = userService.allUser();
        return info;
    }
}
