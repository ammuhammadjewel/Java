
package Polymorphism;


public class Triangle extends Shape {
    
    
    public Triangle()
	    {
		
	    }
	
        public  Triangle(double height ,double width)
	
        {
		super(height,width);
		/*this.height = height ;
		this.width = width ;*/
		
	    }
	


        public void calculateArea()
	{
		System.out.println("height: "+height) ;
		System.out.println("width: "+width) ;
		System.out.println("area: "+(.5*height*width)) ;
		
	}
}
    
    
    
    
    
    

/*
//area
    double base,height;
    
    Triangle(double base, double height){
        this.base = base ;
        this.height = height ;
    }
    
    double area(){
        return 0.5*base*height;
    }
    
    
}

    
    
    // Private member variables
   private int base, height;
   
   Constructs a Triangle instance with the given color, base and height 
   public Triangle(String color, int base, int height) {
      super(color);
      this.base = base;
      this.height = height;
   }
   
   Returns a self-descriptive string
   @Override
   public String toString() {
      return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
   }
   
  Override the inherited getArea() to provide the proper implementation for triangle
   @Override
   public double getArea() {
      return 0.5*base*height;
   }
}
*/