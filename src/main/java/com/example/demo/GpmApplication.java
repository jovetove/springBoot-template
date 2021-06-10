package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jove
 */
@MapperScan("com.example.demo.mapper")
@SpringBootApplication
public class GpmApplication {
    public static void main(String[] args) {
        SpringApplication.run(GpmApplication.class, args);
    }

}
