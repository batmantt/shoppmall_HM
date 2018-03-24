package com.gb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gb.dao.AdminMapper;
import com.gb.model.Admin;
import com.gb.service.AdminService;

@Component
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;

	@Override
	public Admin findAdminByNameAndPsd(String adminName, String adminPsd) {

		return adminMapper.findAdminByNameAndPsd(adminName, adminPsd);
	}

	@Override
	public int deleteAdmin(Integer id) {
		return adminMapper.deleteAdmin(id);
	}

	@Override
	public List<Admin> findAllAdmin() {
		return adminMapper.findAllAdmin();
	}

	@Override
	public int addAdmin(Admin admin) {
		return adminMapper.addAdmin(admin);
	}

	@Override
	public int updateAdminInfo(Admin admin) {
		return adminMapper.updateAdminInfo(admin);
	}

}
