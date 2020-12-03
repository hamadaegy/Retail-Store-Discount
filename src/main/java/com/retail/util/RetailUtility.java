package com.retail.util;

import com.retail.model.Bill;

public class RetailUtility {
	public static float calculateDiscount(Bill bill, int discount, String userType) {
		if (userType.equals("Ordinary"))
			return calculateDiscountForOrdinaryUser(bill, discount);

		float amount = bill.getAmount();
		float precentage = (discount / 100F) * amount;
		return amount - precentage;
	}

	private static float calculateDiscountForOrdinaryUser(Bill bill, int discount) {
		float amount = bill.getAmount();
		int discountValue = ((int) amount / 100) * discount;
		return amount - discountValue;
	}

}
