package com.example.alibabaconsumeropenfeign9000.controller;

import com.example.alibabacloudcommonsresult.entity.JsonResult;
import com.example.alibabaconsumeropenfeign9000.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/getInfo/{id}")
    public JsonResult getInfo(@PathVariable("id") Long id) {
        return feignService.getInfo(id);
    }
}
