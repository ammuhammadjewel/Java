
package Polymorphism;

public class Shape {
    
    double height;
    double width;

	
        public Shape()
	    {
		
	    }
	
        public Shape(double height ,double width)
	
        {
		this.height = height ;
		this.width = width ;
		
	    }

        public void calculateArea()
	{
		System.out.println("height: "+height) ;
		System.out.println("width: "+width) ;
		
	}
    
}



//double area(){return 0;}
/*  

double height;
    double width;

	
        public Shape()
	    {
		
	    }
	
        public Shape(double height ,double width)
	
        {
		this.height = height ;
		this.width = width ;
		
	    }

        public void calculateArea()
	{
		System.out.println("height: "+height) ;
		System.out.println("width: "+width) ;
		
	}




// Private member variable
   private String color;
   
   Constructs a Shape instance with the given color
   public Shape (String color) {
      this.color = color;
   }

   // Returns a self-descriptive string
   @Override
   public String toString() {
      return "Shape[color=" + color + "]";
   }
   
   // All shapes must provide a method called getArea()
   public double getArea() {
      // We have a problem here!
      // We need to return some value to compile the program.
      System.err.println("Shape unknown! Cannot compute area!");
      return 0;}*/