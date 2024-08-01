Open - CLosed Principle
=======================
	Def: A s/w componet should be closed for "Modifications" , but open for "Extensions"

	  Example:
	  	A HealthInsurance Company -- has a method to calculate discount on premium using CutomerProfile -class
	  discount calculator(HealthCustomerProfile cust) 
 		
	 PROBLEM
	 ======= 
     If comp acquire Vehicle Insurance company and wants to use same discount method using Customer profile w.r.t Vehicle Insurance
     
    SOLution
    ===========
    NOT so viable: Overloading the discount calculator(VehicleCustomerProfile cust) 

    
    Better Solution : 
    Step 1: ADD an INTERFACE for CutomerProfile
    			i.e CustomerProfile-Interface which has "isLoyal()"
    
    Step 2: Make HealthCutomerProfile class & VehicleCustomerProfile- Class to implement it
    
    
    Step 3: Finally update InsuranceDiscountCaluclator(CutomerProfile cust)
             { logic }