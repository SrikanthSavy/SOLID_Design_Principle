package com.softwaredesign.solid.liskov.problem2;

public class InHouseProduct extends Product {
		
	// We will update the instanc evariable "discoun= 1.5X"
	public void getExtraDiscount()
	{
		discount = 1.5* discount;
	}

}
