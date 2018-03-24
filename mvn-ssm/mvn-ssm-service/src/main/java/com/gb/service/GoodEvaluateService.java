package com.gb.service;

import java.util.List;

import com.gb.model.GoodEvaluate;

public interface GoodEvaluateService {
	// 添加商品评价
	int addGoodEvaluate(GoodEvaluate goodEvaluate);

	// 删除商品评价
	int deleteGoodEvaluate(Integer userId, Integer goodId);

	// 更新商品评价
	// int updateGoodEvaluateById(Integer id);

	// 查找商品评价
	List<GoodEvaluate> findGoodEvaluate(Integer goodId);
}
