package com.softwaredesign.solid.single_responsibility;

public class Employee {

	private String employeeId;
	private String employeeName;
	private String employeeMobile;
	private String employeeType;
	private int employeeAge;
	
	//DB- COnnection and Persistance Logic 
	public void save()
	{
		
	}
	
	//Calculate Tax
	public void calculateTax()
	{
		if(this.employeeType.equals("full-time"))
		{
			// full time tax calulation Loggic 
		}else {
			// Part-tim eTax Calculation
		}
		
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
