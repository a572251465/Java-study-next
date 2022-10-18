package com.example.alibabaconsumer9000.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.alibabacloudcommonsresult.entity.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Value("${service-url.nacos-user-service}")
    private String serviceURL;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/fallback/{id}")
    @SentinelResource(value = "fallback", fallback = "errorFallback")
    public JsonResult fallback(@PathVariable Long id) {
        if (id <= 3) {
            return restTemplate.getForObject(serviceURL+"/info/"+id,JsonResult.class);
        } else {
            throw new NullPointerException("没有对应的数据");
        }
    }

    public JsonResult errorFallback(Long id, Throwable e) {
        return new JsonResult(404, "未找到商品");
    }
}
