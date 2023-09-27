
package Abstraction;

public class Rectangle extends Shape {
    Rectangle(double height, double width){
        super(height, width);
    }
    @Override
    void area(){
        double result = height * width;
        System.out.println("Rectangle area: "+result);
    }
    
}
