package com.example.serverfeign.service;

import com.example.serverfeign.entity.BaseGoodsInfo;
import com.example.serverfeign.service.impl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassDescribe:
 * Author :wangzhanhua
 * Date: 2017-11-20
 * Since
 * To change this template use File | Settings | File Templates.
 */
@FeignClient(value = "wms-consumer-base",fallback = HelloServiceImpl.class)
public interface HelloService {
    @GetMapping(value = "/base-feign")
    public BaseGoodsInfo hiService(@RequestParam(value = "name") String name) ;
}
