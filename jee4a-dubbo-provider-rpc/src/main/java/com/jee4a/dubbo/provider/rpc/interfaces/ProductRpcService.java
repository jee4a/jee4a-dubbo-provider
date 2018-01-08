package com.jee4a.dubbo.provider.rpc.interfaces;

import com.jee4a.dubbo.provider.rpc.model.ProductModel;

/**
 * <p>商品接口类</p> 
 * @author tpeng 2018年1月8日
 * @email 398222836@qq.com
 */
public interface ProductRpcService {

	/**
	 * 
	 * 描述     : 根据商品Id获取商品对象
	 * @author tpeng 2018年1月8日
	 * @email 398222836@qq.com
	 */
	public ProductModel queryProductById(Integer productId) ;
}
