package com.softwaredesign.solid.liskov.solution2;

public class InHouseProduct extends Product {
	
		@Override
		public double getDiscount() {
			//Inovke Your edited "Discount * 1.5 method
			this.getExtraDiscount();
			return discount;
		}
	
	
	// We will update the instanc evariable "discoun= 1.5X"
	public void getExtraDiscount()
	{
		discount = 1.5* discount;
		
	}

}
