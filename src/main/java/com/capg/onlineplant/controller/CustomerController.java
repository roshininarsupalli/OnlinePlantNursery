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

import com.capg.onlineplant.entity.Customer;

import com.capg.onlineplant.exception.CustomerIdNotFoundException;

import com.capg.onlineplant.service.CustomerService;

@RestController
@RequestMapping("/customers")
@CrossOrigin("http://localhost:4200")
public class CustomerController {
@Autowired
  CustomerService service;
	
	@PostMapping(path="/addCustomer")
	public ResponseEntity<Boolean> addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
		
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	} 
	
//	@GetMapping(path="/getdetails/{customerId}")
//	public ResponseEntity<Customer> findCustomerById(@PathVariable("customerId") int customerId) {
//		Customer customer=service.findCustomerById(customerId);
//		if (customer == null) {
//         throw new CustomerNotFoundException("Customer not found for id=" + customerId);
//      }
//		return new ResponseEntity<Customer>(customer,new HttpHeaders(),HttpStatus.OK);
//	}

	@PutMapping(path="/updateCustomer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		customer=service.updateCustomer(customer);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	@DeleteMapping(path="/removeCustomer")
	public ResponseEntity<Customer> removeCustomer(@RequestBody Customer customer) {
		customer=service.removeCustomer(customer);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<Customer>> getAll(){
		List<Customer> list=service.viewAllCustomers();
		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
	
	}
	@GetMapping(path="/viewCustomer/{customerId}")
	public  ResponseEntity<Customer> viewCustomer(@PathVariable("customerId") int customerId){
		Customer customer=service.viewCustomer(customerId);
		if(customer == null) {
			throw new CustomerIdNotFoundException("Customer not found for id="+customerId);
		}
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	@GetMapping(path= "/validateCustomer/{username}/{password}")
	public ResponseEntity<Customer> validateCustomer(@PathVariable String username ,@PathVariable String password) 
	{
		Customer customer=service.validateCustomer(username,password);
		
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);	
	}
	
}







