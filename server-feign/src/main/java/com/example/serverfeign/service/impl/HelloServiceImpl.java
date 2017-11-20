package com.example.serverfeign.service.impl;


import com.example.serverfeign.entity.BaseGoodsInfo;
import com.example.serverfeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Component
public class HelloServiceImpl implements HelloService{
    @Override
    public BaseGoodsInfo hiService(String name) {
        return null;
    }


}
