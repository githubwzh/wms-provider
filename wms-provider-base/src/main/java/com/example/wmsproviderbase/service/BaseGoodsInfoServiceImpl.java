package com.example.wmsproviderbase.service;

import com.example.wmsproviderbase.dao.BaseGoodsInfoMapper;
import com.example.wmsproviderbase.entity.BaseGoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassDescribe:
 * Author :wangzhanhua
 * Date: 2017-10-18
 * Since
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BaseGoodsInfoServiceImpl  {
    @Autowired
    BaseGoodsInfoMapper baseGoodsInfoMapper ;
    public BaseGoodsInfo selectByPrimaryKey(Long skuid) {
        return baseGoodsInfoMapper.selectByPrimaryKey(skuid);
    }
}
