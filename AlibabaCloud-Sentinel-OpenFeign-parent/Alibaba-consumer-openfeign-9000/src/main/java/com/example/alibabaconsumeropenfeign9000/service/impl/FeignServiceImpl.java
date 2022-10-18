package com.example.alibabaconsumeropenfeign9000.service.impl;

import com.example.alibabacloudcommonsresult.entity.JsonResult;
import com.example.alibabaconsumeropenfeign9000.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public JsonResult<String> getInfo(Long id) {
        return new JsonResult<>(404, "服务器降级处理");
    }
}
