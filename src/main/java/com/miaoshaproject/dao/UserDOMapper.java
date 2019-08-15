package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.UserDO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface UserDOMapper {
    UserDO selectByPrimaryKey(Integer id);

    int insertSelective(UserDO userDO);

    UserDO selectByTelphone(String telphone);
}