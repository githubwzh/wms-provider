package com.example.serverfeign.web;
import com.example.serverfeign.entity.BaseGoodsInfo;
import com.example.serverfeign.service.HelloService;
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
