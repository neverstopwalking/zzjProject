package com.example.zzjproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.zzjproject.mapper")
public class ZzjProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZzjProjectApplication.class, args);
    }

}
