package com.gb.model;

public class Admin {
	private Integer id;
	private String adminName;
	private String adminPsd;
	private Integer identityInfo;

	public Integer getIdentityInfo() {
		return identityInfo;
	}

	public void setIdentityInfo(Integer identityInfo) {
		this.identityInfo = identityInfo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPsd() {
		return adminPsd;
	}

	public void setAdminPsd(String adminPsd) {
		this.adminPsd = adminPsd;
	}

}
