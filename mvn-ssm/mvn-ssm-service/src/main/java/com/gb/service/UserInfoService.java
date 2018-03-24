package com.gb.service;

import com.gb.model.UserInfo;

public interface UserInfoService {

	// 查询用户个人信息
	UserInfo findInfoByUserId(Integer userId);
}
