package com.softwaredesign.solid.liskov.problem1;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {
	
	public static void main(String[] args) 
	{
		
		Car first	= new Car();
		Car second	= new Car();
		Car third	= new RacingCar();
		
		
		List<Car> myCarsList = new ArrayList<Car>();
		
		myCarsList.add(first);
		myCarsList.add(second);
		myCarsList.add(third);
		
		for(Car car: myCarsList)
		{
			System.out.println(car.getCabinWidth());  //Problem with Racing Car , it return ) or no implmentation o
		}
		
	}

}

// o/p:
//12.5
//12.5
//0.0 // Just like Ostrich ( no fly() )

