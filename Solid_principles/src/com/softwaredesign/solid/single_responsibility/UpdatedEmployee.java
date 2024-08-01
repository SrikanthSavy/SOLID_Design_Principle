package com.softwaredesign.solid.single_responsibility;

import com.softwaredesign.solid.single_responsibility.util.EmployeeRepository;
import com.softwaredesign.solid.single_responsibility.util.TaxCalculator;

public class UpdatedEmployee {
	private String employeeId;
	private String employeeName;
	private String employeeMobile;
	private String employeeType;
	private int employeeAge;
	
	//save to DB logic
	public void save()
	{
		new EmployeeRepository().save(this);
	}
	
	//Calculate Tax
	
	public void calculateTax()
	{
		new TaxCalculator().taxCalculator(this);
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeMobile() {
		return employeeMobile;
	}
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	
	
	

}
