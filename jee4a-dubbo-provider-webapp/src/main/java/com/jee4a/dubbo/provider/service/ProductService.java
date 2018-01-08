package com.jee4a.dubbo.provider.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.jee4a.dubbo.provider.common.model.JProduct;
import com.jee4a.dubbo.provider.manager.JProductManager;
import com.jee4a.dubbo.provider.rpc.exceptions.ApiException;
import com.jee4a.dubbo.provider.rpc.interfaces.ProductRpcService;
import com.jee4a.dubbo.provider.rpc.model.ProductModel;

/**
 * <p></p> 
 * @author tpeng 2018年1月8日
 * @email 398222836@qq.com
 */
@Service
public class ProductService implements  ProductRpcService  {
	
	private static Logger logger = LoggerFactory.getLogger(ProductService.class) ;

	@Resource
	private JProductManager jProductMapper ;
	/** 
	 * @author tpeng 2018年1月8日
	 * @email 398222836@qq.com
	 */
	@Override
	public ProductModel queryProductById(Integer productId) {
		logger.error("hit me ,productId : {}",productId);
		if(productId ==null || productId<=0) {
			throw new ApiException(-10000,"productId 不能为空");
		}
		ProductModel model = null;
		JProduct product = jProductMapper.selectByPrimaryKey(productId) ;
		if(null != product ) {
			model = new ProductModel() ;
			BeanUtils.copyProperties(product, model);
		} 
		return model;
	}

}
