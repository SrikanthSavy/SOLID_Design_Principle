package com.softwaredesign.solid.open_closed;

import java.util.Random;

//Updated to implement with Interface "CustomerProfile  "
public class VehicleInsuranceCutomerProfile implements CustomerProfile{

	@Override
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}

	
}
