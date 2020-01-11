package com.aaa.czj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.aaa.czj.dao"})
public class SpringbootlayuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootlayuiApplication.class, args);
    }

}
