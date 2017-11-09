package com.example.wmsproviderbase.dao;

import com.example.wmsproviderbase.entity.BaseGoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * ClassDescribe:
 * Author :wangzhanhua
 * Date: 2017-10-19
 * Since
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BaseGoodsInfoMapper {
    private final SqlSession sqlSession;

    public BaseGoodsInfoMapper(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public BaseGoodsInfo selectByPrimaryKey(long id) {
        return this.sqlSession.selectOne("selectByPrimaryKey", id);
    }
}
