package com.roncoo.eshop.product.ha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cks
 * @Date: Created by 14:20 2018/5/23
 * @Package: com.roncoo.eshop.product.ha.controller
 * @Description:
 */
@RestController
public class ProductController {


    @GetMapping("/getProductInfo")
    public String getProductInfo(Long productId) {
        return "{\"id\": " + productId + ", \"name\": \"iphone7手机\", \"price\": 5599, \"pictureList\":\"a.jpg,b.jpg\", \"specification\": \"iphone7的规格\", \"service\": \"iphone7的售后服务\", \"color\": \"红色,白色,黑色\", \"size\": \"5.5\", \"shopId\": 1, \"modifiedTime\": \"2018-01-01 12:00:00\", \"cityId\": 1, \"brandId\": 1}";
    }
}
