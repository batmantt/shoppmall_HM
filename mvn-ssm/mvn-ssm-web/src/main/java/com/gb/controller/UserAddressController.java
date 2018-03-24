package com.gb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gb.constant.ConstantData;
import com.gb.model.UserAddress;
import com.gb.service.UserAddressService;

@Controller
@RequestMapping(value = "user")
public class UserAddressController {
	@Autowired
	private UserAddressService userAddressService;

	// 新增地址
	@RequestMapping(value = "addaddress", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addAddress(UserAddress address) {
		Map<String, Object> map = new HashMap<String, Object>();
		int value = userAddressService.addAddress(address);
		if (value > 0) {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

	// 修改地址信息
	@RequestMapping(value = "modifyaddress", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> modifyAddress(UserAddress address) {
		Map<String, Object> map = new HashMap<String, Object>();
		int value = userAddressService.updateAddressById(address);
		if (value > 0) {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

	// 设置默认地址
	@RequestMapping(value = "setdefault", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> setDefaultAddress(Integer addressId) {
		Map<String, Object> map = new HashMap<String, Object>();
		int value = userAddressService.setDefaultAddress(addressId);
		int value1 = userAddressService.setUndefault(addressId);
		if (value > 0 && value1 > 0) {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

	// 删除地址
	@RequestMapping(value = "removeaddress", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> removeAddress(Integer addressId) {
		Map<String, Object> map = new HashMap<String, Object>();
		int value = userAddressService.deleteAddressById(addressId);
		if (value > 0) {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

	// 显示地址条数
	@RequestMapping(value = "showcount")
	@ResponseBody
	public Map<String, Object> showCount(Integer userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		int value = userAddressService.getAddressCount(userId);
		map.put("addresscount", value);
		return map;

	}

	// 显示订单里的地址信息
	@RequestMapping(value = "showaddress", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> showAddress(Integer addressId) {
		Map<String, Object> map = new HashMap<String, Object>();
		UserAddress address = userAddressService.findAddressByAddressId(addressId);
		if (address != null) {
			map.put("address", address);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

	// 显示用户的所有地址
	@RequestMapping(value = "showAllAddress")
	@ResponseBody
	public Map<String, Object> showAllAddress(Integer userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<UserAddress> addresses = userAddressService.findAddressByUserId(userId);
		if (addresses != null) {
			map.put("addressList", addresses);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);

		}

		return map;

	}

	// 显示用户默认地址
	@RequestMapping(value = "showDefault")
	@ResponseBody
	public Map<String, Object> showDefaultAddress(Integer userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		UserAddress userAddress = userAddressService.findDefaultAddress(userId);
		if (userAddress != null) {
			map.put("defaultaddress", userAddress);
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
		}
		return map;

	}

}
