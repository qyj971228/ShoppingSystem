package com.qyj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qyj.Mapper")
public class ShoppingManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingManagementSystemApplication.class, args);
    }

}
