package com.gb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gb.dao.OrderSubMapper;
import com.gb.model.OrderSub;
import com.gb.service.OrderSubService;

@Service
public class OrderSubServiceImpl implements OrderSubService {
	@Autowired
	private OrderSubMapper orderSubMapper;
	/*
	 * @Autowired private InventoryController inventoryController;
	 */

	private OrderSubServiceImpl(OrderSubMapper orderSubMapper) {
		super();
		this.orderSubMapper = orderSubMapper;
	}

	@Transactional
	@Override
	public int insertOrderSub(List<OrderSub> orderSubs) {
		// TODO Auto-generated method stub
		return orderSubMapper.insertOrderSub(orderSubs);
	}

	@Override
	public int updateGoodStatus(Integer goodId, Integer goodStatus) {
		// TODO Auto-generated method stub
		return orderSubMapper.updateGoodStatus(goodId, goodStatus);
	}

	@Transactional
	@Override
	public OrderSub findOrderSub(Integer goodId) {
		// TODO Auto-generated method stub
		return orderSubMapper.findOrderSub(goodId);
	}

	@Transactional
	@Override
	public List<OrderSub> findOrderSubList(Integer orderId) {
		// TODO Auto-generated method stub

		return orderSubMapper.findOrderSubList(orderId);
	}

}
