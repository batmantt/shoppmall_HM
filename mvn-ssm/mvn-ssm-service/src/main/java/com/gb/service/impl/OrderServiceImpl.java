package com.gb.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gb.dao.OrderMapper;
import com.gb.model.Order;
import com.gb.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	public OrderServiceImpl(OrderMapper orderMapper) {
		super();
		this.orderMapper = orderMapper;
	}

	// 生成订单
	@Transactional
	@Override
	public int addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.insertOrder(order);
	}

	// 修改订单
	@Override
	public int updateOrderByOrderId(Integer orderId, Integer statu) {
		// TODO Auto-generated method stub
		return orderMapper.updateOrderByOrderId(orderId, statu);
	}

	// 显示订单列表
	@Transactional
	@Override
	public List<Order> showOrderByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return orderMapper.findOrderByUserId(userId);
	}

	// 显示订单详情
	@Transactional
	@Override
	public Order showOrderByOrderId(Integer orderId) {
		// TODO Auto-generated method stub
		return orderMapper.findAddressByOrderId(orderId);
	}

	// 查询商家的所有订单
	@Transactional
	@Override
	public List<Order> findOrderBySellerId(Integer sellerId) {
		// TODO Auto-generated method stub
		return orderMapper.findOrderBySellerId(sellerId);
	}

	// 按照订单状态显示
	@Override
	public List<Order> findOrderByStatus(Integer userId, Integer statu) {
		// TODO Auto-generated method stub
		return orderMapper.findOrderByStatus(userId, statu);
	}

	// 按照下单日期显示
	@Override
	public List<Order> findOrderByDate(Integer userId, Date buyDate) {
		// TODO Auto-generated method stub
		return orderMapper.findOrderByDate(userId, buyDate);
	}

	// 按照订单号查询
	@Override
	public List<Order> findOrderByOrderId(Integer orderId) {
		// TODO Auto-generated method stub
		return orderMapper.findOrderByOrderId(orderId);
	}

}
