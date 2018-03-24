package com.gb.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties({ "handler", "hibernateLazyInitializer" })
public class ShoppingCart {

	private Integer id;
	private String userId;
	private Integer goodId;
	private Integer quantity;

	private List<Goods> goodList;

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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the goodList
	 */
	public List<Goods> getGoodList() {
		return goodList;
	}

	/**
	 * @param goodList
	 *            the goodList to set
	 */
	public void setGoodList(List<Goods> goodList) {
		this.goodList = goodList;
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
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the good
	 */
	public List<Goods> getGood() {
		return goodList;
	}

	/**
	 * @param good
	 *            the good to set
	 */
	public void setGood(List<Goods> goodList) {
		this.goodList =  goodList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ShoppingCart [userId=" + userId + ", goodId=" + goodId
				+ ", quantity=" + quantity + ", goodList=" + goodList + "]";
	}

}
