package com.project812.tuofu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;

@SpringBootApplication(exclude = {MultipartAutoConfiguration.class})
@MapperScan(basePackages = "com.project812.tuofu.dao")
public class TuofuApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuofuApplication.class, args);
    }

}
