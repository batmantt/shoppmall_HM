package com.gb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gb.dao.UserAddressMapper;
import com.gb.model.UserAddress;
import com.gb.service.UserAddressService;

@Service
public class UserAddressServiceImpl implements UserAddressService {
	@Autowired
	private UserAddressMapper userAddressMapper;

	private UserAddressServiceImpl(UserAddressMapper userAddressMapper) {
		super();
		this.userAddressMapper = userAddressMapper;
	}

	@Transactional
	@Override
	public int addAddress(UserAddress address) {
		// TODO Auto-generated method stub
		return userAddressMapper.insertAddress(address);
	}

	@Transactional
	@Override
	public int updateAddressById(UserAddress address) {
		// TODO Auto-generated method stub
		return userAddressMapper.updateAddressById(address);
	}

	@Transactional
	@Override
	public int setDefaultAddress(Integer addressId) {
		// TODO Auto-generated method stub
		return userAddressMapper.setDefaultAddress(addressId);

	}

	@Transactional
	@Override
	public int setUndefault(Integer addressId) {
		// TODO Auto-generated method stub
		return userAddressMapper.setUndefault(addressId);
	}

	@Transactional
	@Override
	public int deleteAddressById(Integer addressId) {
		// TODO Auto-generated method stub
		return userAddressMapper.deleteAddressById(addressId);
	}

	@Transactional
	@Override
	public UserAddress findAddressByAddressId(Integer addressId) {
		// TODO Auto-generated method stub
		return userAddressMapper.findAddressByAddressId(addressId);
	}

	@Transactional
	@Override
	public List<UserAddress> findAddressByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return userAddressMapper.findAddressByUserId(userId);
	}

	@Transactional
	@Override
	public int getAddressCount(Integer userId) {
		// TODO Auto-generated method stub
		return userAddressMapper.selectAddressCount(userId);
	}

	@Transactional
	@Override
	public UserAddress findDefaultAddress(Integer userId) {
		// TODO Auto-generated method stub
		return userAddressMapper.findDefaultAddress(userId);
	}

}
