package com.example.wmsconsumerbase.controller;

import com.example.wmsconsumerbase.entity.BaseGoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
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
        System.out.println("当前服务端口："+port);
        return this.restTemplate.getForObject("http://localhost:8003/baseGoodsInfo/" + id, BaseGoodsInfo.class);
    }
    @RequestMapping("/base-feign")
    public BaseGoodsInfo findBySkuid01(@RequestParam String name){
        System.out.println("当前服务端口："+port);
        return this.restTemplate.getForObject("http://localhost:8003/baseGoodsInfo/" + name, BaseGoodsInfo.class);
    }
}
