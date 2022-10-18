package com.example.alibabacloudsentinel02.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.alibabacloudsentinel02.error.ErrorHandle;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @SentinelResource(value = "common", blockHandler = "testAError", blockHandlerClass = ErrorHandle.class)
    public String getCommon() {
        return "common";
    }
}
