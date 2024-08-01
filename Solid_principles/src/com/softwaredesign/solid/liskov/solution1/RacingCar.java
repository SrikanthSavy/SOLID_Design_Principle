package com.softwaredesign.solid.liskov.solution1;

public class RacingCar implements Vehicle {
	
	
	@Override
	public double getIntriorWidth() {
		return getCockpitWidth();
	}
	
	public double getCockpitWidth()
	{
		return 25.0;
	}

}
