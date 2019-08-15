package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.SequenceDO;


public interface SequenceDOMapper {

    int insert(SequenceDO record);

    int insertSelective(SequenceDO record);

}