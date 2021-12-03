package com.capg.onlineplant.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.onlineplant.dao.CartDao;
import com.capg.onlineplant.entity.Cart;
@Transactional
@Service
public class CartServiceImpl implements CartService{
	@Autowired
	   CartDao deo;

	@Override
	public Cart addCart(Cart cart) {
		return deo.addCart(cart);
	}

	@Override
	public Cart updateCart(Cart cart) {
		return deo.updateCart(cart);
	}

	@Override
	public Cart removeCart(Cart cart) {
		return deo.removeCart(cart);
	}
	
	@Override
	public List<Cart> viewAllCarts(){
		return deo.viewAllCarts();
		}

}
