package com.example.wmsconsumerbase.controller;

import com.example.wmsconsumerbase.entity.BaseGoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassDescribe:
 * Author :wangzhanhua
 * Date: 2017-11-02
 * Since
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class BaseController {
    @Autowired
    private RestTemplate restTemplate ;
    @Value("${server.port}")
    String port;
    @GetMapping("/base/{id}")
    public BaseGoodsInfo findBySkuid(@PathVariable Long id){
        return this.restTemplate.getForObject("http://localhost:8003/baseGoodsInfo/" + id, BaseGoodsInfo.class);
    }
}
