package com.gb.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties({ "handler", "hibernateLazyInitializer" })
public class UserAddress {

	private Integer addressId;
	private Integer userId;
	private String receiverName;
	private String receiverPhone;
	private String province;
	private String city;
	private String area;
	private String street;
	private String detailedAddress;
	private String zipCode;
	private Integer defaultStatus;

	/**
	 * @return the id
	 */
	public Integer getAddressId() {
		return addressId;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userTel
	 *            the userTel to set
	 */
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the receiverName
	 */
	public String getReceiverName() {
		return receiverName;
	}

	/**
	 * @param receiverName
	 *            the receiverName to set
	 */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	/**
	 * @return the receiverPhone
	 */
	public String getReceiverPhone() {
		return receiverPhone;
	}

	/**
	 * @param receiverPhone
	 *            the receiverPhone to set
	 */
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province
	 *            the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the detailedAddress
	 */
	public String getDetailedAddress() {
		return detailedAddress;
	}

	/**
	 * @param detailedAddress
	 *            the detailedAddress to set
	 */
	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the defaultStatus
	 */
	public Integer getDefaultStatus() {
		return defaultStatus;
	}

	/**
	 * @param defaultStatus
	 *            the defaultStatus to set
	 */
	public void setDefaultStatus(Integer defaultStatus) {
		this.defaultStatus = defaultStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserAddress [userId=" + userId + ", orderId="  + ", receiverName=" + receiverName
				+ ", receiverPhone=" + receiverPhone + ", province=" + province + ", city=" + city + ", area=" + area
				+ ", street=" + street + ", detailedAddress=" + detailedAddress + ", zipCode=" + zipCode
				+ ", defaultStatus=" + defaultStatus + "]";
	}

}
