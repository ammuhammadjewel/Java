
package Polymorphism;

public class Rectangle extends Shape {
    
    public Rectangle()
	    {
		
	    }
	
        public  Rectangle(double height ,double width)
	
        {
		super(height,width);
		/*this.height = height ;
		this.width = width ;*/
		
	    }
	


        public void calculateArea()
	{
		System.out.println("height: "+height) ;
		System.out.println("width: "+width) ;
		System.out.println("area: "+(height*width)) ;
		
	}
}
    
    
    
    
    
/*
//area
    double length, width;
    
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    double area(){
        return length * width ;
    }
  
}
public class Rectangle extends Shape {
    


 // Private member variables
   private int length, width;
   
   Constructs a Rectangle instance with the given color, length and width
   public Rectangle(String color, int length, int width) {
      super(color);
      this.length = length;
      this.width = width;
   }

   Returns a self-descriptive string   
   @Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
   }
   
   Override the inherited getArea() to provide the proper implementation for rectangle
   @Override
   public double getArea() {
      return length*width;
   }
    
}*/