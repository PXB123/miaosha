package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.ItemStockDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ItemStockDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemStockDO record);

    int insertSelective(ItemStockDO record);

    ItemStockDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemStockDO record);

    int updateByPrimaryKey(ItemStockDO record);

    ItemStockDO selectByItemId(Integer id);

    int decreaseStock(@Param("itemId") Integer itemId,@Param("amount") Integer amount);
}