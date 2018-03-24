package com.gb.dao;

import com.gb.model.UserInfo;

public interface UserInfoMapper {

	// 查询用户个人信息
	UserInfo findInfoByUserId(Integer userId);

	// 修改用户个人信息
	int updateInfoByUserId(UserInfo userInfo);
}
