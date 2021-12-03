package com.capg.onlineplant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.onlineplant.entity.Cart;

import com.capg.onlineplant.service.CartService;

@RestController
@RequestMapping("/cart")
@CrossOrigin("http://localhost:4200")

public class CartController {
	@Autowired
	  CartService serv;
	
	@PostMapping(path="/addCart")
	public ResponseEntity<Boolean> addCart(@RequestBody Cart cart) {
		serv.addCart(cart);
		
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	} 
	@PutMapping(path="/updateCart")
	public ResponseEntity<Cart> updateCart(@RequestBody Cart cart){
		cart=serv.updateCart(cart);
		return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}
	@DeleteMapping(path="/removeCart")
	public String removeCart(@PathVariable("cart") Cart cart) {
		serv.removeCart(cart);
		return "Deleted";
	}
	
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<Cart>> getAll(){
		List<Cart> list=serv.viewAllCarts();
		return new ResponseEntity<List<Cart>>(list,HttpStatus.OK);
	
	}

}
