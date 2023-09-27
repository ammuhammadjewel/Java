
package Polymorphism;

public class MainShape {
    
    
    public static void main(String[] arg)
   {
   Shape s= new Shape (1.1 ,2.2);
   s.calculateArea();
   
   s = new Rectangle(2.2, 3.3);
   s.calculateArea();
   
   s = new Triangle(3.3, 4.4);
   s.calculateArea();
   
   Rectangle r = new Rectangle(4.4,6.6);
   r.calculateArea();
   
   Triangle t = new Triangle(2.2, 3.3);
   t.calculateArea();
   
   }
}
    
    
    
    
    
    

    
    /*



}
    public static void main(String[] args){
         
        Shape s1 = new Shape();
        Shape s2 = new Rectangle(10, 20);
        Shape s3 = new Triangle(30, 40);
        
        System.out.println("Area for Shape: "+s1.area());
        System.out.println("Area for Rectangle: "+s2.area());
        System.out.println("Area for Triangle: "+s3.area());

    
}



public static void main(String[] arg){
        Shape[] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Rectangle(10,20);
        s[2] = new Triangle(30,40);
        for (int i = 0; i < 3; i++){
            System.out.println(s[i].area());
        }       
    }  
}


/*
public static void main(String[] args) {
      Shape s1 = new Rectangle("red", 4, 5);  // Upcast
      System.out.println(s1);  // Run Rectangle's toString()
      //Rectangle[length=4,width=5,Shape[color=red]]
      System.out.println("Area is " + s1.getArea());  // Run Rectangle's getArea()
      //Area is 20.0

      Shape s2 = new Triangle("blue", 4, 5);  // Upcast
      System.out.println(s2);  // Run Triangle's toString()
      //Triangle[base=4,height=5,Shape[color=blue]]
      System.out.println("Area is " + s2.getArea());  // Run Triangle's getArea()
      //Area is 10.0
   }
    }*/
    
