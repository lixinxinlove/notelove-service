package com.lixinxinlove.notelove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lixinxinlove.notelove.dao")
public class NoteloveApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoteloveApplication.class, args);
    }

}
