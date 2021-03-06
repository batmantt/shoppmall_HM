package com.gb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gb.constant.ConstantData;
import com.gb.model.UserInfo;
import com.gb.service.UserInfoService;

@Controller
@RequestMapping("user")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;

	// 按照ID查找用户信息
	@RequestMapping("findInfoByUserId")
	@ResponseBody
	public Map<String, Object> findInfoByUserId(Integer userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		UserInfo userinfo = userInfoService.findInfoByUserId(userId);
		if (userinfo == null) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "查询失败");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "查询成功");
			map.put("userinfo", userinfo);
		}

		return map;
	}

}
