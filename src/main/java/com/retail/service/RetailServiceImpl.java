package com.retail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.config.UserType;
import com.retail.model.NetPayableResponse;
import com.retail.model.User;
import com.retail.util.RetailUtility;

@Service
public class RetailServiceImpl implements RetailService {

	@Autowired
	UserType userType;

	public RetailServiceImpl() {
	}

	@Override
	public NetPayableResponse clacNetPayableAmount(User user) {
		NetPayableResponse response = new NetPayableResponse();
		int discount = userType.getUserDiscount(user.getUserType());
		float amount = RetailUtility.calculateDiscount(user.getBill(), discount, user.getUserType());
		response.setNetAmount(amount);
		response.setUser(user);
		return response;
	}

	@Override
	public boolean checkUserIfFound(String userType) {
		return this.userType.isUserExsist(userType);
	}

}
