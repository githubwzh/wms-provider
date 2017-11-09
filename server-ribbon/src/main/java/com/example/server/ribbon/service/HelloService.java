package com.example.server.ribbon.service;


import com.example.server.ribbon.entity.BaseGoodsInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Service
public class HelloService {
    /**
     * 改造HelloService类，在hiService方法上加上@HystrixCommand注解。该注解对该方法创建了熔断器的功能，
     * 并指定了fallbackMethod熔断方法，
     * 熔断方法直接返回了一个字符串，字符串为”hi,”+name+”,sorry,error!”，代码如下：
     */
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public BaseGoodsInfo hiService(String name) {
        return restTemplate.getForObject("http://wms-consumer-base/base/"+name,BaseGoodsInfo.class);
    }
    public BaseGoodsInfo hiError(String name) {
        return null;
//        return "hi,"+name+",sorry,error!";
    }

}
