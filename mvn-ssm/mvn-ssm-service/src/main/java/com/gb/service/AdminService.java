package com.gb.service;

import java.util.List;

import com.gb.model.Admin;

public interface AdminService {

	List<Admin> findAllAdmin();

	Admin findAdminByNameAndPsd(String adminName, String adminPsd);

	int deleteAdmin(Integer id);

	int addAdmin(Admin admin);

	int updateAdminInfo(Admin admin);

}
