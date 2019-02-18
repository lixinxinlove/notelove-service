package com.lixinxinlove.notelove.dao;

import com.lixinxinlove.notelove.dataobject.NoteDO;

public interface NoteDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NoteDO record);

    int insertSelective(NoteDO record);

    NoteDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NoteDO record);

    int updateByPrimaryKey(NoteDO record);
}