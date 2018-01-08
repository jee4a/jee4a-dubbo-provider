package com.jee4a.dubbo.provider.common.mapper;

import com.jee4a.dubbo.provider.common.model.JProduct;

public interface JProductMapper {
    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(JProduct record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(JProduct record);

    /**
     * 根据主键查询记录
     */
    JProduct selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(JProduct record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(JProduct record);
}