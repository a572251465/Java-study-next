package com.lihh.controller;

import com.lihh.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping(value = "/getInfo", method = {RequestMethod.GET, RequestMethod.POST})
    public String getInfo(String params) {
        return params + "getInfo";
    }

    @RequestMapping(value = "/testDemo")
    @ResponseBody
    @CrossOrigin
    public User testDemo(User user) {
        return user;
    }
}
