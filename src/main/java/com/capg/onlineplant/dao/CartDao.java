package com.capg.onlineplant.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.onlineplant.entity.Cart;

@Repository
public interface CartDao {
	
		Cart addCart(Cart cart);
		Cart updateCart(Cart cart);
		Cart removeCart(Cart cart);
		List<Cart> viewAllCarts();

}
