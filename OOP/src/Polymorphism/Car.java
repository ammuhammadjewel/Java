
package Polymorphism;
import java.lang.*;
public class Car extends Vehicle {
    public String brandName ;
	public int seatNumber ;
 

        public Car(){}
        
        public  Car(String name ,int plateNumber, int wheelNumber, String brandName,int seatNumber)
        {
		super(name,plateNumber,wheelNumber);
		this.brandName = brandName ;
		this.seatNumber = seatNumber ;
	    }
		
	    public void show()
	{   
                System.out.println("Vehicle name: "+name);
                System.out.println("Vehicle Plate Number: "+plateNumber);
                System.out.println("Vehicle wheel Number: "+wheelNumber);
                System.out.println("bran dName: "+brandName) ;
		System.out.println("seat Number: "+seatNumber) ;
				
	}
    
    
}
