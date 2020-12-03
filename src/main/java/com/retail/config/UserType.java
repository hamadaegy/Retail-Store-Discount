package com.retail.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserType {
	private Map<String, Integer> users;

	public UserType() {
		users = new HashMap<String, Integer>();
		users.put("Customer", 5);
		users.put("Employee", 30);
		users.put("Ordinary", 5);
		users.put("AffiliateUser", 10);
	}

	public int getUserDiscount(String userType) {
		return users.get(userType);
	}

	public boolean isUserExsist(String userType) {
		return users.containsKey(userType);
	}

}
