package com.capg.onlineplant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue
   private int adminId;
   public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getAdminUsername() {
	return adminUsername;
}
public void setAdminUsername(String adminUsername) {
	this.adminUsername = adminUsername;
}
public String getAdminPassword() {
	return adminPassword;
}
public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}
private String adminUsername;
   private String adminPassword;
public Admin(int adminId, String adminUsername, String adminPassword) {
	super();
	this.adminId = adminId;
	this.adminUsername = adminUsername;
	this.adminPassword = adminPassword;
}
@Override
public String toString() {
	return "Admin [adminId=" + adminId + ", adminUsername=" + adminUsername + ", adminPassword=" + adminPassword + "]";
}
}