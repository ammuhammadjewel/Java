
package Polymorphism;
import java.lang.*;
public class Bike extends Vehicle{
    String brandName;
    
    public Bike(){}
   public Bike(String name, int plateNumber, int wheelNumber, String brandName){
       super(name,plateNumber,wheelNumber);
		this.brandName = brandName ;
   }
    public void show()
	{   
         System.out.println("Vehicle name: "+name);
         System.out.println("Vehicle Plate Number: "+plateNumber);
         System.out.println("Vehicle wheel Number: "+wheelNumber);
         System.out.println("bran dName: "+brandName) ;
                
				
	}

    
}
