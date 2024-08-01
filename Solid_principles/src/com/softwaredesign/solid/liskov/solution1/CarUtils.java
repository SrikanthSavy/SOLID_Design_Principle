package com.softwaredesign.solid.liskov.solution1;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {
	
	public static void main(String[] args) 
	{
		
		Vehicle first	= new Car();
		Vehicle second	= new Car();
		Vehicle third	= new RacingCar();
		
		
		List<Vehicle> myCarsList = new ArrayList<Vehicle>();
		
		myCarsList.add(first);
		myCarsList.add(second);
		myCarsList.add(third);
		
		for(Vehicle car: myCarsList)
		{
			System.out.println(car.getIntriorWidth());  //Solution , by breaking the Hierarchy in Inheritance
		}
		
	}

}

// o/p:
//12.5
//12.5
//25.0

