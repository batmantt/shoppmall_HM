package com.gb.model;

import java.sql.Date;
import java.util.List;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties({ "handler", "hibernateLazyInitializer" })
public class Order {

	private Integer id;
	private Integer orderId;
	private Integer userId;
	private Integer addressId;
	private Integer sellerId;
	private Date buyDate;
	private Double total;
	private String pay;
	private Date deliverDate;
	private Integer statu;
	private Integer drawBill;

	private List<OrderSub> orderSubs;
	private UserAddress address;

	// private Logistics logistics;

	/**
	 * @return the buyDate
	 */
	public Date getBuyDate() {
		return buyDate;
	}

	/**
	 * @param buyDate
	 *            the buyDate to set
	 */
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	/**
	 * @param deliverDate 
	 * @return the deliverDate
	 */
	public Date getDeliverDate() {
		return deliverDate;
	}

	/**
	 * @param deliverDate
	 *            the deliverDate to set
	 */
	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	/**
	 * @return the statu
	 */
	public Integer getStatu() {
		return statu;
	}

	/**
	 * @param statu
	 *            the statu to set
	 */
	public void setStatu(Integer statu) {
		this.statu = statu;
	}

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
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the sellerId
	 */
	public Integer getSellerId() {
		return sellerId;
	}

	/**
	 * @param sellerId
	 *            the sellerId to set
	 */
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * @return the pay
	 */
	public String getPay() {
		return pay;
	}

	/**
	 * @param pay
	 *            the pay to set
	 */
	public void setPay(String pay) {
		this.pay = pay;
	}

	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId
	 *            the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return statu;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer statu) {
		this.statu = statu;
	}

	/**
	 * @return the drawBill
	 */
	public Integer getDrawBill() {
		return drawBill;
	}

	/**
	 * @param drawBill
	 *            the drawBill to set
	 */
	public void setDrawBill(Integer drawBill) {
		this.drawBill = drawBill;
	}

	/**
	 * @return the address
	 */
	public UserAddress getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(UserAddress address) {
		this.address = address;
	}

	/**
	 * @return the logistics
	 */
	/*
	 * public Logistics getLogistics() { return logistics; }
	 *//**
	 * @param logistics
	 *            the logistics to set
	 */
	/*
	 * public void setLogistics(Logistics logistics) { this.logistics =
	 * logistics; }
	 *//**
	 * @return the orderSubs
	 */
	public List<OrderSub> getOrderSubs() {
		return orderSubs;
	}

	/**
	 * @param orderSubs
	 *            the orderSubs to set
	 */
	public void setOrderSubs(List<OrderSub> orderSubs) {
		this.orderSubs = orderSubs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId
				+ ", sellerId=" + sellerId + ", buyDate=" + buyDate
				+ ", total=" + total + ", pay=" + pay + ", deliverDate="
				+ deliverDate + ", status=" + statu + ", drawBill=" + drawBill
				+ ", " + "address=" + address + super.toString()
				+ ", logistics=" + "]";
	}

}
