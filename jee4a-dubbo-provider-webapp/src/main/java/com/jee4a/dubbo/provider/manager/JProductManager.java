package com.jee4a.dubbo.provider.manager;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jee4a.dubbo.provider.common.mapper.JProductMapper;
import com.jee4a.dubbo.provider.common.model.JProduct;

@Component
public class JProductManager {
    @Resource
    private JProductMapper jProductMapper ;
    /**
     * 保存属性不为空的记录
     */
    public void insertSelective(JProduct record) {
    	jProductMapper.insertSelective(record) ;
    }

    /**
     * 根据主键查询记录
     */
    public JProduct selectByPrimaryKey(Integer id) {
    	return jProductMapper.selectByPrimaryKey(id) ;
    }

    /**
     * 根据主键更新属性不为空的记录
     */
    public void  updateByPrimaryKeySelective(JProduct record) {
    	jProductMapper.updateByPrimaryKeySelective(record) ;
    }

   
}