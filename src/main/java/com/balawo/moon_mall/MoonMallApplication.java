package com.balawo.moon_mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


// 扫描包mapper注解
@MapperScan("com.balawo.moon_mall.mapper")
public class MoonMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoonMallApplication.class, args);
    }

}
