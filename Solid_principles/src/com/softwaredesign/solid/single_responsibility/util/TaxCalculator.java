package com.softwaredesign.solid.single_responsibility.util;

import com.softwaredesign.solid.single_responsibility.UpdatedEmployee;

public class TaxCalculator {
	
	public void  taxCalculator(UpdatedEmployee employee)
	{
		if(employee.getEmployeeType().equals("full-time"))
		{
			//calculate Logic
		}else {
			//calculate Tax logic
		}
	}

}
