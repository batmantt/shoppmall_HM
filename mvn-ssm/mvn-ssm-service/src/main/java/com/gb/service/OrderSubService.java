package com.gb.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gb.model.OrderSub;

public interface OrderSubService {
	// 添加订单商品
	int insertOrderSub(List<OrderSub> orderSubs);

	// 修改订单中的商品的状态
	int updateGoodStatus(@Param("goodId") Integer goodId, @Param("goodStatus") Integer goodStatus);

	// 显示订单中的商品信息
	OrderSub findOrderSub(Integer goodId);

	// 显示订单中所有商品信息
	List<OrderSub> findOrderSubList(Integer orderId);
}
