package com.capg.onlineplant.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.onlineplant.dao.CustomerDao;
import com.capg.onlineplant.entity.Customer;
import com.capg.onlineplant.entity.Planter;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

@Autowired
   CustomerDao dao;

public Customer addCustomer(Customer customer) {
return dao.addCustomer(customer);
}
public Customer updateCustomer(Customer customer)
{
	return dao.updateCustomer(customer);
}
public Customer removeCustomer(Customer customer) {
	return dao.removeCustomer(customer);
}
public List<Customer> viewAllCustomers(){
return dao.viewAllCustomers();
}
public Customer viewCustomer(int customerId) {
	return dao.viewCustomer(customerId);
}
public Customer validateCustomer(String username,String password)
{
	return dao.validateCustomer(username,password);
}
}
