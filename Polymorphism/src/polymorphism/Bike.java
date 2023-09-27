
package polymorphism;

public class Bike extends Vehicle {
    
    public String brandName ;
        
	Bike(String name ,int plateNumber, int wheelNumber, String brandName){
		
		super(name, plateNumber, wheelNumber);
		this.brandName = brandName;
			
	    }
	
    @Override
    public void show(){
        System.out.println("Bike name: "+name) ;
	System.out.println("Bike plate Number: "+plateNumber) ;
	System.out.println("Bike wheel Number: "+wheelNumber) ;
	System.out.println("Bike bran dName: "+brandName) ;
				
	}
    
}
