package com.gb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gb.dao.ShoppingCartMapper;
import com.gb.model.ShoppingCart;
import com.gb.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	@Autowired
	private ShoppingCartMapper shoppingCartMapper;

	private ShoppingCartServiceImpl(ShoppingCartMapper shoppingCartMapper) {
		super();
		this.shoppingCartMapper = shoppingCartMapper;
	}

	@Override
	public int addGood(ShoppingCart shoppingcart) {
		// TODO Auto-generated method stub
		return shoppingCartMapper.insertGood(shoppingcart);
	}

	@Override
	public int removeGood(Integer goodId) {
		// TODO Auto-generated method stub
		return shoppingCartMapper.deleteGood(goodId);
	}

	@Override
	public int removeAllGoodsByUserId(Integer userId, List<Integer> goodId) {
		// TODO Auto-generated method stub
		return shoppingCartMapper.deleteAllGoodsByUserId(userId, goodId);
	}

	@Override
	public int updateGoodCount(ShoppingCart shoppingcart) {
		// TODO Auto-generated method stub
		return shoppingCartMapper.updateGoodCount(shoppingcart);
	}

	@Override
	public List<ShoppingCart> findGoodsByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return shoppingCartMapper.findGoodsByUserId(userId);
	}

	@Override
	public List<ShoppingCart> findGoodsByGoodId(Integer userId, List<Integer> goodId) {
		return shoppingCartMapper.findGoodsByGoodId(userId, goodId);
	}

}
