package com.softwaredesign.solid.liskov.problem2;

import java.util.ArrayList;
import java.util.List;

public class PricingUtil {
	
	public static void main(String[] args) 
	{
		
	
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new InHouseProduct();
	
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
	
		for(Product product: productList)
		{
			if(product instanceof InHouseProduct) // updating discount class variable ///////This is th eproblem 
				((InHouseProduct)product).getExtraDiscount();
			
			System.out.println(product.getDiscount());
		}
	
	}
}


//NOTES: Not a Good Design , where you are telling the subtype to update the instanc evariable