package com.example.wmsproviderbase.controller;

import com.example.wmsproviderbase.entity.BaseGoodsInfo;
import com.example.wmsproviderbase.service.BaseGoodsInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassDescribe:
 * Author :wangzhanhua
 * Date: 2017-10-18
 * Since
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/baseGoodsInfo")
public class BaseGoodsInfoController {
    @Autowired
    BaseGoodsInfoServiceImpl baseGoodsInfoService ;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseGoodsInfo getAccountById(@PathVariable("id") Long id) {

        return baseGoodsInfoService.selectByPrimaryKey(id);
    }


}
