
	DEF: A s/w component should have 1 & only 1 "reason for change"
                              or 
     A s/w component should have 1 & only 1 "single Responsibility"

PROBLEM:
========
	If you notice that Employee Class has 3 "Reasons to change"
	
	1) Employee Related - Changes
	2) DB - Change
	3) Tax calculation -Change

SOLUTION
========
	TO separate these "reason for change" i.e
	
	TaxCalculator - Class
	EmployeeRepository- Class

	
	Now we have UpdatedEmployee Class whic Adheres to "single reason for change" 
	As DatabAse-Logic and Tax Calculation Logic is separated
	
	
	 