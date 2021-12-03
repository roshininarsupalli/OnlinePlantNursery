package com.capg.onlineplant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.onlineplant.entity.Customer;

@Service
public interface CustomerService {
	 List<Customer> viewAllCustomers();
	   Customer viewCustomer(int customerId);
		
	    Customer validateCustomer(String username,String password);
		Customer addCustomer(Customer customer);
		Customer updateCustomer(Customer customer);
		Customer removeCustomer(Customer customer);


}
