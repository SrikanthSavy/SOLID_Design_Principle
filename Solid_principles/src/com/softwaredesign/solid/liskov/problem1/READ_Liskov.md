	Liskov Substitution Principle
	==============================
	
	Def: Objects should be "replaceable" with their Sub-types,
	                          Without affecting the correctness of the program.
	                          
	  Example: Car <-- IS-A --- HatchBack
	            Bird<-- IS-A----Ostrich  [Hidden Problem] cannot be replaced by its Sub type XXXXXXXXXX
	            Gasoline <---IS-A-- Petrol
	            
	   Liskov Substitution solves 2 types of pattern problems
	   
	   1) Breaking the Hierarchy 
	   2) Tell, Dont Ask! 
	   
	   1) Breaking the hierarchy 
	   =======================
	         Example : CAR                      getCabinWidth()
	            	       RocingCar extends Car    getCabinWidth(){empty} , getCockpitWidth{//works}
	            	                   
  
      Solution:    Solves it by adding an Interface Vehicle {public double getInteriorWidth}
     
     2) Tell, DOnt ASK : Pattern Problems
     ====================
     			Example : Amazon ( Product ===     class variable  discount,    getDiscount()
     									InHouseProduct (extends PRoduct) =>  discount = discount*1.5
     			
     			Problem: 
     					for(Product product: productList){
								if(product instanceof InHouseProduct) 
									((InHouseProduct)product).getExtraDiscount();
								System.out.println(product.getDiscount());
						}
	
				In the above code, we are asking discount ,based on Subtypes Object. BAD Design
				
				Solution:
						Tell, Dont ask 
						 Step1: Inside I"InHouseProduct" class "@override" getdiscount(){ call you extraDiscount()}
						 Step2: in "Util" class, remove ( "instance(inHouseProduct) logic from for(){}
						
						
						