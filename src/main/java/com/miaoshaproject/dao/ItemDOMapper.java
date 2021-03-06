package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.ItemDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemDO record);

    int insertSelective(ItemDO record);

    ItemDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemDO record);

    int updateByPrimaryKey(ItemDO record);

    List<ItemDO> listItem();
}