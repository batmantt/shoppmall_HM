package com.gb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gb.dao.UserInfoMapper;
import com.gb.model.UserInfo;
import com.gb.service.UserInfoService;

@Component
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo findInfoByUserId(Integer userId) {
		return userInfoMapper.findInfoByUserId(userId);
	}

}
