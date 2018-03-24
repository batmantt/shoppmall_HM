package com.gb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gb.constant.ConstantData;
import com.gb.model.Admin;
import com.gb.service.AdminService;

/**
 * 管理员
 * 
 * @author WZB
 * 
 */
//ajax跨域
@CrossOrigin
@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "add")
	@ResponseBody
	public Map<String, Object> addAdmin(Admin admin) {
		Map<String, Object> map = new HashMap<String, Object>();
		// admin.setAdminPsd("111");
		int adm = adminService.addAdmin(admin);
		if (adm == 0) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "添加失败");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "添加成功");
			map.put("admin", adm);
		}

		return map;
	}

	// 按照ID查找管理员信息
	@RequestMapping("findAll")
	@ResponseBody
	public Map<String, Object> findAllAdmin() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Admin> admlist = adminService.findAllAdmin();
		if (admlist == null) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "查询失败");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "查询成功");
			map.put("admin", admlist);
		}

		return map;
	}

	// 删除（子）管理员
	@RequestMapping("delete")
	@ResponseBody
	public Map<String, Object> deleteAdmin(Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		int adm = adminService.deleteAdmin(id);
		if (adm == 0) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "删除失败");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "删除成功");
			map.put("admin", adm);
		}

		return map;
	}

	// 管理员登录验证
	@RequestMapping(value = "login")
	@ResponseBody
	public Map<String, Object> findAdminByNameAndPsd(String adminName, String adminPsd) {
		Map<String, Object> map = new HashMap<String, Object>();
		Admin adm = adminService.findAdminByNameAndPsd(adminName, adminPsd);
		if (adm == null) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "用户名或密码错误");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "登录成功");
			map.put("admin", adm);
		}

		return map;
	}

	// 修改管理员信息

	@RequestMapping(value = "update")
	@ResponseBody
	public Map<String, Object> updateAdminInfo(Admin admin) {
		Map<String, Object> map = new HashMap<String, Object>();
		int adm = adminService.updateAdminInfo(admin);
		if (adm == 0) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "修改失败");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "修改成功");
			map.put("admin", adm);
		}

		return map;
	}

}
