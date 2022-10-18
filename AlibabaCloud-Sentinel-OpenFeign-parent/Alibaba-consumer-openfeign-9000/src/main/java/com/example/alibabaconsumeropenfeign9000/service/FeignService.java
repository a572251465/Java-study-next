package com.example.alibabaconsumeropenfeign9000.service;

import com.example.alibabacloudcommonsresult.entity.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(value = "sentinel-openfeign-client")
public interface FeignService {
    @GetMapping(value = "/info/{id}")
    public JsonResult<String> getInfo(@PathVariable Long id);
}
