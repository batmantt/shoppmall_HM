package com.gb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gb.model.ShoppingCart;

public interface ShoppingCartMapper<ShopingCart> {
	// 往购物车添加商品
	int insertGood(ShoppingCart shoppingcart);

	// 删除购物车商品
	int deleteGood(Integer goodId);

	// 生成订单时，将商品从购物车中删除
	int deleteAllGoodsByUserId(@Param("userId") Integer userId, @Param("goodId") List<Integer> goodId);

	// 修改购物车商品数量
	int updateGoodCount(ShoppingCart shoppingcart);

	// 显示购物车所有商品
	List<ShopingCart> findGoodsByUserId(Integer userId);

	// 选择购物车中的商品进行结算
	List<ShoppingCart> findGoodsByGoodId(@Param("userId") Integer userId, @Param("goodId") List<Integer> goodId);

}
