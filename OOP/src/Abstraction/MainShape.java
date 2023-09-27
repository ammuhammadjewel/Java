
package Abstraction;

public class MainShape {
    public static void main(String[] arg){
        Shape shape;
        
        shape = new Rectangle(10,20);
        shape.area();
        
        shape = new Triangle(20,30);
        shape.area();
        
        shape = new Circle(30);
        shape.area();
    }
    
}
