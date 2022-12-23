package com.lihh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lihh.mapper")
public class SpringbootMyBatisPlus {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMyBatisPlus.class, args);
    }
}
