package com.gb.service;

import java.util.List;

import com.gb.model.SellerAdmissionInfo;

public interface SellerAdmissionInfoService {

	// 查找所有申请入驻的商家sellerId
	List<SellerAdmissionInfo> findSellerAdmission();

	// 查询所有申请入驻信息
	SellerAdmissionInfo findAllInfo(Integer sellerId);

	// 修改审核状态
	int changeAuditState(SellerAdmissionInfo sellerAdmissionInfo);

	// 查询已入驻商家
	List<SellerAdmissionInfo> findSuccessSettled();
}
