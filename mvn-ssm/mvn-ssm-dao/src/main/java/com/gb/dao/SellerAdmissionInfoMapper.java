package com.gb.dao;

import java.util.List;

import com.gb.model.SellerAdmissionInfo;

public interface SellerAdmissionInfoMapper {

	// 查找所有申请入驻的商家sellerId
	List<SellerAdmissionInfo> findSellerAdmission();

	// 查找所有商家申请信息
	SellerAdmissionInfo findAllInfo(Integer sellerId);

	// 修改审核状态
	int changeAuditState(SellerAdmissionInfo sellerAdmissionInfo);

	// 查询已入驻商家
	List<SellerAdmissionInfo> findSuccessSettled();
}
