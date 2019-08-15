package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.UserPasswordDO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface UserPasswordDOMapper {
        UserPasswordDO selectByPrimaryKey(Integer id);

        int insertSelective(UserPasswordDO userPasswordDO);

        UserPasswordDO selectByUserId(Integer id);
}