package com.tioad.videodemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tioad.videodemo.dao")
public class VideoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoDemoApplication.class, args);
    }

}
