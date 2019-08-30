package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.SequenceDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SequenceDOMapper {

    int insert(SequenceDO record);

    int insertSelective(SequenceDO record);

    SequenceDO getSequenceByName(String name);

    int updateByPrimaryKey(SequenceDO sequenceDO);
}