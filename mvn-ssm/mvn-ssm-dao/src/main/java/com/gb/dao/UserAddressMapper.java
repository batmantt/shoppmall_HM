package com.gb.dao;

import java.util.List;

import com.gb.model.UserAddress;

public interface UserAddressMapper {
	// 新增地址
	int insertAddress(UserAddress address);

	// 修改地址信息
	int updateAddressById(UserAddress address);

	// 设置默认收货地址
	int setDefaultAddress(Integer addressId);

	// 将默认地址设为非默认状态
	int setUndefault(Integer addressId);

	// 删除地址
	int deleteAddressById(Integer addressId);

	// 获取用户已创建的地址条数
	int selectAddressCount(Integer userId);

	// 订单里显示用户的地址信息
	UserAddress findAddressByAddressId(Integer addressId);

	// 显示用户的所有地址
	List<UserAddress> findAddressByUserId(Integer userId);

	// 显示用户默认地址
	UserAddress findDefaultAddress(Integer userId);
}
