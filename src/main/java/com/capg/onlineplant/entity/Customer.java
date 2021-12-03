package com.capg.onlineplant.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue
       private int customerId;
	   private String customerName;
	   private String customerEmail;
	   private String username;
	   private String password;
	   
	   //@JsonIgnore
		 //@OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
		 //@JoinColumn(name="address")
	   //private Address address;
	   public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
//public Address getAddress() {
//return address;
//}
//public void setAddress(Address address) {
	//this.address = address;
//}

public Customer(int customerId, String customerName, String customerEmail, String username, String password) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerEmail = customerEmail;
	this.username = username;
	this.password = password;
	//this.address = address;
}
public Customer() {
	
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", customeEmail=" + customerEmail + ",  username=" + username + ", password=" + password + "]";
}
}
