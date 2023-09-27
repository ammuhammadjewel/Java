
package polymorphism;

public class Car extends Bike {
    //public String brandName ;
	public int seatNumber ;
 

        //public Car(){}
        
        public  Car(String name ,int plateNumber, int wheelNumber, String brandName,int seatNumber)
        {
		super(name,plateNumber,wheelNumber,brandName);
		this.brandName = brandName ;
		this.seatNumber = seatNumber ;
	    }
		
    @Override
    public void show(){   
        
                System.out.println("Car name: "+name);
                System.out.println("Car Plate Number: "+plateNumber);
                System.out.println("Car wheel Number: "+wheelNumber);
                System.out.println("Car bran dName: "+brandName) ;
		System.out.println("Car seat Number: "+seatNumber) ;
				
	}
       
}