package com.gb.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gb.constant.ConstantData;
import com.gb.model.Order;
import com.gb.service.OrderService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(value = "user")
public class OrderController {
	@Autowired
	private OrderService orderService;

	// 生成订单
	@RequestMapping(value = "submitOrder", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addOrder(Order order) {
		Map<String, Object> map = new HashMap<String, Object>();
		Date date = new Date();
		order.setBuyDate(new java.sql.Date(date.getTime()));
		// order.setBuyDate(ToolUtil.currentTime());
		// java.sql.Date
		// date2=order.setDeliverDate((ToolUtil.stringToDate(order.getDeliverDate())));
		int value = orderService.addOrder(order);
		// 生成订单并返回code
		if (value > 0) {
			map.put("resultCode", ConstantData.STATUS_CODE_1);

		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

	// 修改订单状态
	@RequestMapping(value = "modifyOrder", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> modifyOrderByOrderId(Integer orderId, Integer statu) {
		Map<String, Object> map = new HashMap<String, Object>();
		int value = orderService.updateOrderByOrderId(orderId, statu);

		// 修改订单并返回code
		if (value > 0) {
			map.put("resultCode", ConstantData.STATUS_CODE_1);

		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);

		}
		return map;

	}

	// 显示用户的所有订单
	@RequestMapping(value = "showAll", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> showAllOrder(Integer userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Order> orders = orderService.showOrderByUserId(userId);
		if (orders != null) {
			map.put("orderList", orders);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

	// 显示订单详情
	@RequestMapping(value = "showOrder", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> showOrder(Integer orderId) {
		Map<String, Object> map = new HashMap<String, Object>();
		Order order = orderService.showOrderByOrderId(orderId);
		if (order != null) {
			map.put("order", order);

		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}

		return map;

	}

	// 显示商家的所有订单
	@RequestMapping(value = "showSellerOrder", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> showSerllerOrder(
			// 设置分页，
			@RequestParam(value = "pageNum", defaultValue = "1") Integer PageNum,
			@RequestParam(value = "pageSize", defaultValue = "10") Integer PageSize, Integer sellerId) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Order> orders = orderService.findOrderBySellerId(sellerId);
		@SuppressWarnings("unused")
		PageInfo<Order> pageInfo = new PageInfo<Order>(orders);
		if (orders != null) {
			map.put("orders", orders);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

	// 按照订单状态显示
	@RequestMapping(value = "showOrderByStatus")
	@ResponseBody
	public Map<String, Object> showOrderByStatus(Integer userId, Integer statu) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Order> orders = orderService.findOrderByStatus(userId, statu);
		if (orders != null) {
			map.put("orders", orders);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

	// 按照下单日期显示
	@RequestMapping(value = "showOrderByDate")
	@ResponseBody
	public Map<String, Object> showOrderByDate(Integer userId, Date buyDate) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 将util.Date转换为sql.Date
		java.sql.Date orderDate = new java.sql.Date(buyDate.getTime());
		List<Order> orders = orderService.findOrderByDate(userId, orderDate);
		if (orders != null) {
			map.put("orders", orders);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

	// 按照订单号查询
	@RequestMapping(value = "showOrderByOrderId")
	@ResponseBody
	public Map<String, Object> showOrderByOrderId(Integer orderId) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Order> orders = orderService.findOrderByOrderId(orderId);
		if (orders != null) {
			map.put("orders", orders);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

}
