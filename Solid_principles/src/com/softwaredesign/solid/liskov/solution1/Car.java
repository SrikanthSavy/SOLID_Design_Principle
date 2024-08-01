package com.softwaredesign.solid.liskov.solution1;

public class Car implements Vehicle{

	@Override
	public double getIntriorWidth() {
		return getCabinWidth();
	}
	
	public double getCabinWidth()
	{
		return 12.5;
	}
}
