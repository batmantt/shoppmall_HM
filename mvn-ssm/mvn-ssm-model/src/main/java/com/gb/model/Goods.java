package com.gb.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties({ "handler", "hibernateLazyInitializer" })
public class Goods {

	private Integer goodId;
	private Integer sellerId;
	private String goodBrand;
	private String goodName;
	private Integer goodTypeId;
	private Double price;
	private Integer goodStatus;
	private Integer salesVolumn;
	private String introduce;
	private String goodColor;
	private String pictureUrl;
	
	// 价格排序字符串参数
	private Integer priceStr;

	public Integer getPriceStr() {
		return priceStr;
	}

	public void setPriceStr(Integer priceStr) {
		this.priceStr = priceStr;
	}


	public Integer getGoodId() {
		return goodId;
	}

	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getGoodBrand() {
		return goodBrand;
	}

	public void setGoodBrand(String goodBrand) {
		this.goodBrand = goodBrand;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public Integer getGoodTypeId() {
		return goodTypeId;
	}

	public void setGoodTypeId(Integer goodTypeId) {
		this.goodTypeId = goodTypeId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getGoodStatus() {
		return goodStatus;
	}

	public void setGoodStatus(Integer goodStatus) {
		this.goodStatus = goodStatus;
	}

	public Integer getSalesVolumn() {
		return salesVolumn;
	}

	public void setSalesVolumn(Integer salesVolumn) {
		this.salesVolumn = salesVolumn;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getGoodColor() {
		return goodColor;
	}

	public void setGoodColor(String goodColor) {
		this.goodColor = goodColor;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

}
