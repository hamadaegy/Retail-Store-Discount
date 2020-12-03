package com.retail.service;

import org.springframework.stereotype.Service;

import com.retail.model.NetPayableResponse;
import com.retail.model.User;

@Service
public interface RetailService {
	NetPayableResponse clacNetPayableAmount(User user);

	boolean checkUserIfFound(String userType);
}
