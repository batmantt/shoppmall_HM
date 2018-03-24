package com.gb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gb.dao.SellerAdmissionInfoMapper;
import com.gb.model.SellerAdmissionInfo;
import com.gb.service.SellerAdmissionInfoService;

@Component
public class SellerAdmissionInfoServiceImpl implements SellerAdmissionInfoService {

	@Autowired
	private SellerAdmissionInfoMapper sellerAdmissionInfoMapper;

	@Override
	public SellerAdmissionInfo findAllInfo(Integer sellerId) {
		return sellerAdmissionInfoMapper.findAllInfo(sellerId);
	}

	@Override
	public int changeAuditState(SellerAdmissionInfo sellerAdmissionInfo) {
		return sellerAdmissionInfoMapper.changeAuditState(sellerAdmissionInfo);
	}

	@Override
	public List<SellerAdmissionInfo> findSellerAdmission() {
		return sellerAdmissionInfoMapper.findSellerAdmission();
	}

	@Override
	public List<SellerAdmissionInfo> findSuccessSettled() {
		return sellerAdmissionInfoMapper.findSuccessSettled();
	}

}
