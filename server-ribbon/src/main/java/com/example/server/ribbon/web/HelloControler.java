package com.example.server.ribbon.web;

import com.example.server.ribbon.entity.BaseGoodsInfo;
import com.example.server.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/base")
    public BaseGoodsInfo hi(@RequestParam String name){
        return helloService.hiService(name);
    }


}
