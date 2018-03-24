package com.gb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.gb.constant.ConstantData;
import com.gb.model.SellerAdmissionInfo;
import com.gb.service.SellerAdmissionInfoService;

@Controller
@RequestMapping("admin")
public class SellerAdmissionInfoController {

	@Autowired
	private SellerAdmissionInfoService sellerAdmissionInfoService;

	// 查找所有申请入驻的商家sellerId
	@RequestMapping(value = "findSellerId")
	@ResponseBody
	public Map<String, Object> findSellerAdmission() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<SellerAdmissionInfo> sellerlist = sellerAdmissionInfoService.findSellerAdmission();
		if (sellerlist == null) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "查询失败");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "查询成功");
			map.put("seller", sellerlist);
		}

		return map;
	}

	/**
	 * 按商家id 查找所有申请入驻填写的信息
	 */
	@RequestMapping("sellerAdmissionInfo")
	@ResponseBody
	public Map<String, Object> findAllInfo(Integer sellerId) {
		Map<String, Object> map = new HashMap<String, Object>();
		SellerAdmissionInfo sellerlist = sellerAdmissionInfoService.findAllInfo(sellerId);
		if (sellerlist == null) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "查询失败");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "查询成功");
			map.put("seller", sellerlist);
		}

		return map;
	}

	// 修改审核状态
	@RequestMapping("changeAuditState")
	@ResponseBody
	public ModelAndView changeAuditState(SellerAdmissionInfo sellerAdmissionInfo) {
		int count = sellerAdmissionInfoService.changeAuditState(sellerAdmissionInfo);
		ModelAndView mv = new ModelAndView();
		mv.setView(new MappingJackson2JsonView());

		Integer n = sellerAdmissionInfo.getAuditStatus();
		if (count != 0) {
			switch (n) {
			case 1:
				mv.addObject(1);
				mv.addObject("未审核");
				break;
			case 2:
				mv.addObject(2);
				mv.addObject("审核中");
				break;
			case 3:
				mv.addObject(3);
				mv.addObject("审核通过");
				break;
			default:
				break;
			}
		} else {
			mv.addObject("审核状态修改失败");
		}
		return mv;
	}

	@RequestMapping(value = "successSettled")
	@ResponseBody
	public Map<String, Object> findSuccessSettled() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<SellerAdmissionInfo> sellerlist = sellerAdmissionInfoService.findSuccessSettled();
		if (sellerlist == null) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "查询失败");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "查询成功");
			map.put("seller", sellerlist);
		}

		return map;
	}

}