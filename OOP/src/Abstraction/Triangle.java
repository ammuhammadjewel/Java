
package Abstraction;

public class Triangle extends Shape{
    Triangle(double height, double width){
        super(height,width);
    }
    @Override
    void area(){
        double result = .5 * height * width;
        System.out.println("Triangle area: "+result);
    }
}
