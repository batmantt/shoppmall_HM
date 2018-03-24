package com.gb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gb.model.Admin;

public interface AdminMapper {

	// 查询所以管理员信息
	List<Admin> findAllAdmin();

	// 添加管理员
	int addAdmin(Admin admin);

	// 删除管理员
	int deleteAdmin(Integer id);

	// 管理员登录验证
	Admin findAdminByNameAndPsd(@Param("adminName") String adminName, @Param("adminPsd") String adminPsd);

	// 修改管理员信息
	int updateAdminInfo(Admin admin);

}
