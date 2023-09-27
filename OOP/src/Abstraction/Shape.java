
package Abstraction;

public abstract class Shape {
     
    double height, width;
    
    Shape(double height, double width){
        this.height = height;
        this.width = width;
    }
    abstract void area();
   /* abstract public double getArea();
   abstract public double getPerimeter();
   abstract public void draw();*/
    
}
