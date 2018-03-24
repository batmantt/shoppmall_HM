package com.gb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gb.dao.GoodEvaluateMapper;
import com.gb.model.GoodEvaluate;
import com.gb.service.GoodEvaluateService;

@Component
public class GoodEvaluateServiceImpl implements GoodEvaluateService {

	@Autowired
	private GoodEvaluateMapper goodEvaluateMapper;

	// 查找商品评价
	@Override
	public List<GoodEvaluate> findGoodEvaluate(Integer goodId) {
		return goodEvaluateMapper.findGoodEvaluate(goodId);
	}

	// 添加商品评价
	@Override
	public int addGoodEvaluate(GoodEvaluate goodEvaluate) {
		return goodEvaluateMapper.addGoodEvaluate(goodEvaluate);
	}

	// 删除商品评价
	@Override
	public int deleteGoodEvaluate(Integer userId, Integer goodId) {
		return goodEvaluateMapper.deleteGoodEvaluate(userId, goodId);
	}

}
