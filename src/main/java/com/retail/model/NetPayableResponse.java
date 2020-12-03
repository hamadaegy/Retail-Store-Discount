package com.retail.model;

public class NetPayableResponse {

	public NetPayableResponse() {
	}

	private User user;
	private float netAmount;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public float getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(float amount) {
		this.netAmount = amount;
	}
}
