package com.lihh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lihh.mapper")
@SpringBootApplication
public class MyBatisLogBackDruidApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisLogBackDruidApplication.class, args);
    }
}
