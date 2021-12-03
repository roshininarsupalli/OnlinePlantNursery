package com.capg.onlineplant.entity;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue
      private int addressId;
	  private String houseNo;
	  private String colony;
	  private String city;
	  private String state;
	  private int pincode;
	  
	// @JsonIgnore
	//@OneToOne
    //@JoinColumn(name="customer")
	// private Customer customer;
	 
 // public Customer getCustomer() {
		//return customer;
	//}
	//public void setCustomer(Customer customer) {
		//this.customer = customer;
	//}
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getHouseNo() {
	return houseNo;
}
public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}
public String getColony() {
	return colony;
}
public void setColony(String colony) {
	this.colony = colony;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

public Address(int addressId, String houseNo, String colony, String city, String state, int pincode) {
	super();
	this.addressId = addressId;
	this.houseNo = houseNo;
	this.colony = colony;
	this.city = city;
	this.state = state;
	this.pincode = pincode;

	
}
@Override
public String toString() {
	return "Address [houseNo=" + houseNo + ", colony=" + colony + ", city=" + city + ", state=" + state
			+ ", pincode=" + pincode + "]";
}
}


