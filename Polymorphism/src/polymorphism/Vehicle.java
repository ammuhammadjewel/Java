
package polymorphism;

public class Vehicle {
    public String name ;
	public int plateNumber ;
	public int wheelNumber ;
	
        public Vehicle()
	    {
		
	    }
		
        public  Vehicle(String name ,int plateNumber, int wheelNumber)
	
        {
		this.name = name ;
		this.plateNumber = plateNumber ;
		this.wheelNumber = wheelNumber ;
		}
	    public void start()
		
		{
			System.out.println(" ");
			
		}	   

		public void Break()
		
		{
			System.out.println(" this is break ");
			
		}
		public void stop()
		
		{
			System.out.println(" this is stop. ");
			
		}
	
      
        public void show()
	{
		System.out.println("Vehicle name: "+name) ;
		System.out.println("Vehicle plate Number: "+plateNumber) ;
		System.out.println("Vehicle wheel Number: "+wheelNumber) ;
		
	}

    
}
