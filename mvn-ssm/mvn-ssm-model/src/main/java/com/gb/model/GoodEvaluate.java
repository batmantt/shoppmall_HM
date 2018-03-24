package com.gb.model;

import java.sql.Timestamp;

public class GoodEvaluate {

	private Integer id;
	private Integer orderId;
	private Integer userId;
	private Integer goodId;
	private String userContent;
	private String sellerReply;
	private Float starSeller;
	private Float starGood;
	private Float starExp;
	private String pictureUrl;
	private String anonymous;
	private Integer useful;
	private Timestamp resourceTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGoodId() {
		return goodId;
	}

	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}

	public String getUserContent() {
		return userContent;
	}

	public void setUserContent(String userContent) {
		this.userContent = userContent;
	}

	public String getSellerReply() {
		return sellerReply;
	}

	public void setSellerReply(String sellerReply) {
		this.sellerReply = sellerReply;
	}

	public Float getStarSeller() {
		return starSeller;
	}

	public void setStarSeller(Float starSeller) {
		this.starSeller = starSeller;
	}

	public Float getStarGood() {
		return starGood;
	}

	public void setStarGood(Float starGood) {
		this.starGood = starGood;
	}

	public Float getStarExp() {
		return starExp;
	}

	public void setStarExp(Float starExp) {
		this.starExp = starExp;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getAnonymous() {
		return anonymous;
	}

	public void setAnonymous(String anonymous) {
		this.anonymous = anonymous;
	}

	public Integer getUseful() {
		return useful;
	}

	public void setUseful(Integer useful) {
		this.useful = useful;
	}

	public Timestamp getResourceTime() {
		return resourceTime;
	}

	public void setResourceTime(Timestamp resourceTime) {
		this.resourceTime = resourceTime;
	}

}
