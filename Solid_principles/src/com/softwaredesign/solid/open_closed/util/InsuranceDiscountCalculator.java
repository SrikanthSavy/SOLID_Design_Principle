package com.softwaredesign.solid.open_closed.util;

import com.softwaredesign.solid.open_closed.CustomerProfile;

//import com.softwaredesign.solid.open_closed.HealthInsuranceCustomerProfile;

public class InsuranceDiscountCalculator {

	/*
	 * public int discountCalculator(HealthInsuranceCustomerProfile customer) {
	 * if(customer.isLoyalCustomer()) return 20;
	 * 
	 * return 0; }
	 */

	// Updated code to adhere to  Open-Closed Principle

	public int discountCalculator(CustomerProfile customer) {
		if (customer.isLoyalCustomer())
			return 20;

		return 0;
	}

}
