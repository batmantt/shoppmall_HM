package com.gb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gb.constant.ConstantData;
import com.gb.model.OrderSub;
import com.gb.service.OrderSubService;

@Controller
@RequestMapping(value = "user")
public class OrderSubController {
	@Autowired
	private OrderSubService orderSubService;
	@Autowired
	private ShoppingCarController shoppingCarController;

	// 生成订单，往表里插入商品信息
	@RequestMapping(value = "addOrderSub", method = RequestMethod.POST)
	public Map<String, Object> addOrderSub(Integer userId, List<OrderSub> orderSubs) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Integer> goodList = new ArrayList<Integer>();
		int value = orderSubService.insertOrderSub(orderSubs);
		// 将订单中的商品Id存到集合里
		for (OrderSub orderSub : orderSubs) {
			goodList.add(orderSub.getGoodId());
		}
		// 生成订单时，把买到的商品从购物车中删除

		if (value > 0) {
			shoppingCarController.removeAllGoods(userId, goodList);
			// inventoryController.modifyStock(orderSubs., stock);
			map.put("resultCode", ConstantData.STATUS_CODE_1);

		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);

		}
		return map;

	}

	// 修改商品状态(退货、退款)
	@RequestMapping(value = "modifyGoodStatus", method = RequestMethod.POST)
	public Map<String, Object> modifyGoodStatus(Integer goodId, Integer goodStatus) {
		Map<String, Object> map = new HashMap<String, Object>();
		int value = orderSubService.updateGoodStatus(goodId, goodStatus);
		if (value > 0) {
			map.put("resultCode", ConstantData.STATUS_CODE_1);

		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);

		}
		return map;
	}

	// 显示订单中所有商品信息
	@RequestMapping(value = "showAllGoods", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> showAllGoods(Integer orderId) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<OrderSub> goodList = orderSubService.findOrderSubList(orderId);
		if (goodList != null) {
			map.put("goodInfo", goodList);

		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);

		}
		return map;
	}

}
