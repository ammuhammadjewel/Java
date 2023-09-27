
package Abstraction;

public class Circle extends Shape {
    Circle(double r){
        super(r,r);
    }
    @Override
    void area(){
        double result = 3.1416 * height * width;
        System.out.println("Circle area: "+result);
        
    }
    
}
