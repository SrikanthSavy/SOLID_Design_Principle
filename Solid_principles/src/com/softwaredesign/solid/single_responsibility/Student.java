package com.softwaredesign.solid.single_responsibility;

import java.util.Date;

public class Student {
	
	private String stId;
	private String sName;
	private Date dob;
	
    public void save()
    {
    	// DB connection Drivers 
    }
    
    
    public String getStId()
    {
    	return stId;
    }
    
    public String getStudentName()
    {
    	return sName;
    }
}
