package com.gb.model;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties({ "handler", "hibernateLazyInitializer" })
public class UserInfo {
	private Integer userId;
	private String userTel;
	private String userLoginName;
	private String userLoginPwd;
	private String userSex;
	private String userEmail;
	private Date createDate;

	// private ShoppingCart shoppingCart;
	private List<Order> orderList;
	private List<UserAddress> addressList;

	// public ShoppingCart getShoppingCart() {
	// return shoppingCart;
	// }
	//
	// public void setShoppingCart(ShoppingCart shoppingCart) {
	// this.shoppingCart = shoppingCart;
	// }

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public List<UserAddress> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<UserAddress> addressList) {
		this.addressList = addressList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserLoginPwd() {
		return userLoginPwd;
	}

	public void setUserLoginPwd(String userLoginPwd) {
		this.userLoginPwd = userLoginPwd;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	// public List<Order> getOrderList() {
	// return orderList;
	// }
	//
	// public void setOrderList(List<Order> orderList) {
	// this.orderList = orderList;
	// }
	//
	// public List<UserAddress> getAddressList() {
	// return addressList;
	// }
	//
	// public void setAddressList(List<UserAddress> addressList) {
	// this.addressList = addressList;
	// }

}
