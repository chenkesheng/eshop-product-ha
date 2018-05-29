package com.roncoo.eshop.product.ha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.roncoo.eshop.product.ha.mapper.UserMapper")
public class ProductHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductHaApplication.class, args);
    }
}
