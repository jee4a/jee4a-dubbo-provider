package com.jee4a.dubbo.provider.rpc.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p></p> 
 * @author tpeng 2018年1月8日
 * @email 398222836@qq.com
 */
public class ProductModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3388646393937759255L;
	
	private Integer id ;
	private String productName ;
	private String shortName  ;
	private BigDecimal price ;
	private Byte status ;
	private Date createTime ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", productName=" + productName + ", shortName=" + shortName + ", price="
				+ price + ", status=" + status + ", createTime=" + createTime + "]";
	}
	
	
	
	
}
