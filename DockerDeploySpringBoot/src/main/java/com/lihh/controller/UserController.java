package com.lihh.controller;

import com.lihh.Service.UserService;
import com.lihh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryAllUser")
    public List<User> queryAllUser() {
        return userService.queryAllUser();
    }
}
