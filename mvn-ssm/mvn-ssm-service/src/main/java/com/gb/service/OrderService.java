package com.gb.service;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gb.model.Order;

public interface OrderService {
	// 生成订单
	int addOrder(Order order);

	// 修改订单
	int updateOrderByOrderId(@Param("orderId") Integer orderId, @Param("statu") Integer statu);

	// 显示订单列表
	List<Order> showOrderByUserId(Integer userId);

	// 显示订单详情
	Order showOrderByOrderId(Integer orderId);

	// 查询商家的所有订单
	List<Order> findOrderBySellerId(Integer sellerId);

	// 按照订单状态显示
	List<Order> findOrderByStatus(@Param("userId") Integer userId, @Param("statu") Integer statu);

	// 按照下单日期显示
	List<Order> findOrderByDate(@Param("userId") Integer userId, @Param("buyDate") Date buyDate);

	// 按照订单号查询
	List<Order> findOrderByOrderId(Integer orderId);

}
