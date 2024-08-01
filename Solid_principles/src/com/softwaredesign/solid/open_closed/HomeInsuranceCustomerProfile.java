package com.softwaredesign.solid.open_closed;

import java.util.Random;

//Updated to implement with Interface "CustomerProfile  "
public class HomeInsuranceCustomerProfile implements CustomerProfile {

	@Override
	public boolean isLoyalCustomer() {
		// TODO Auto-generated method stub
		return new Random().nextBoolean();
	}

	

}
