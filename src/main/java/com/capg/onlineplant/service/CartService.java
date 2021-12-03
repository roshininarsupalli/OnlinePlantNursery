package com.capg.onlineplant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.onlineplant.entity.Cart;

@Service
public interface CartService {
	Cart addCart(Cart cart);
	Cart updateCart(Cart cart);
	Cart removeCart(Cart cart);
	List<Cart> viewAllCarts();

}
