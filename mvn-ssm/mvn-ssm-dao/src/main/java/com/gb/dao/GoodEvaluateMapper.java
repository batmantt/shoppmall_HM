package com.gb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gb.model.GoodEvaluate;

public interface GoodEvaluateMapper {
	// 添加商品评价
	int addGoodEvaluate(GoodEvaluate goodEvaluate);

	// 删除商品评价
	int deleteGoodEvaluate(@Param("userId") Integer userId, @Param("goodId") Integer goodId);

	// // 更新商品评价
	// int updateGoodEvaluateById(GoodEvaluate goodEvaluate);

	// 显示某个商品评价
	List<GoodEvaluate> findGoodEvaluate(Integer goodId);

	// 判断商品评价是否完成

}
