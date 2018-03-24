package com.gb.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties({ "handler", "hibernateLazyInitializer" })
public class OrderSub {



	private Integer id;
	private Integer orderId;
	private Integer userId;
	private Integer goodId;
	private String goodName;
	private String goodColor;
	private Integer goodCount;
	private Double price;
	private Integer goodStatus;
	private String photo;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}
	
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the goodId
	 */
	public Integer getGoodId() {
		return goodId;
	}

	/**
	 * @param goodId
	 *            the goodId to set
	 */
	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}

	/**
	 * @return the goodName
	 */
	public String getGoodName() {
		return goodName;
	}

	/**
	 * @param goodName
	 *            the goodName to set
	 */
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	/**
	 * @return the goodColor
	 */
	public String getGoodColor() {
		return goodColor;
	}

	/**
	 * @param goodColor
	 *            the goodColor to set
	 */
	public void setGoodColor(String goodColor) {
		this.goodColor = goodColor;
	}

	/**
	 * @return the goodCount
	 */
	public Integer getGoodCount() {
		return goodCount;
	}

	/**
	 * @param goodCount
	 *            the goodCount to set
	 */
	public void setGoodCount(Integer goodCount) {
		this.goodCount = goodCount;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the goodStatus
	 */
	public Integer getGoodStatus() {
		return goodStatus;
	}

	/**
	 * @param goodStatus
	 *            the goodStatus to set
	 */
	public void setGoodStatus(Integer goodStatus) {
		this.goodStatus = goodStatus;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderSub [orderId=" + orderId + ", goodId=" + goodId
				+ ", goodName=" + goodName + ", goodColor=" + goodColor
				+ ", goodCount=" + goodCount + ", price=" + price
				+ ", goodStatus=" + goodStatus + "]";
	}

}
