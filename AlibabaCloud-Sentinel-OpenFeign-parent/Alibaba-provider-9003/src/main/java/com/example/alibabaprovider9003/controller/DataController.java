package com.example.alibabaprovider9003.controller;

import com.example.alibabacloudcommonsresult.entity.JsonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class DataController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, String> map = new HashMap<>();
    static {
        map.put(1L,"鼠标");
        map.put(2L,"键盘");
        map.put(3L,"耳机");
    }

    @GetMapping(value = "/info/{id}")
    public JsonResult<String> getInfo(@PathVariable Long id) {

        System.out.println("此时访问的端口是:" + serverPort);

        return new JsonResult<>(200, map.get(id));
    }
}
