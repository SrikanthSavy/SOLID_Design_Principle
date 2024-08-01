package com.softwaredesign.solid.liskov.problem1;

public class RacingCar extends Car {
	
	
	@Override
	public double getCabinWidth() {
		return 0;// No implementation
	}
	
	public double getCockpitWidth()
	{
		return 25.0;
	}

}
