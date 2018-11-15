package com.lmjun.unitdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.lmjun.unitdemo.dao")
public class UnitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnitDemoApplication.class, args);
    }
}
