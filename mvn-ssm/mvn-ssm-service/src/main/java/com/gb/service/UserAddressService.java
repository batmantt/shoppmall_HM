package com.gb.service;

import java.util.List;

import com.gb.model.UserAddress;

public interface UserAddressService {
	// 新增地址
	int addAddress(UserAddress address);

	// 修改地址信息
	int updateAddressById(UserAddress address);

	// 设置默认收货地址
	int setDefaultAddress(Integer id);

	// 将默认地址设为非默认状态
	int setUndefault(Integer id);

	// 删除地址
	int deleteAddressById(Integer id);

	// 获取用户已创建的地址条数
	int getAddressCount(Integer userId);

	// 订单里显示用户的地址信息
	UserAddress findAddressByAddressId(Integer addressId);

	// 显示用户的所有地址
	List<UserAddress> findAddressByUserId(Integer userId);

	// 显示用户默认地址
	UserAddress findDefaultAddress(Integer userId);

}
