package com.retail.model;

public class User {

	public User() {
	}

	public User(Bill bill, String userType) {
		this.bill = bill;
		this.userType = userType;
	}

	private Bill bill;
	private String userType;

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
}
