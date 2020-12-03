package com.retail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.model.NetPayableResponse;
import com.retail.model.User;
import com.retail.service.RetailService;

@RestController
public class RetailController {

	@Autowired
	RetailService service;

	public RetailController() {
	}

	@GetMapping(value = "/retail", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> fetchRetailNetPayable(@RequestBody User user) {
		boolean isUserFound = service.checkUserIfFound(user.getUserType());
		if (!isUserFound)
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("");
		
		NetPayableResponse response = service.clacNetPayableAmount(user);
		return ResponseEntity.ok(response);
	}

}
