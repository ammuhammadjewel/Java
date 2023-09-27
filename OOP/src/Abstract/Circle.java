
package Abstract;
public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

      
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
 
        return 2 * pi * radius;
    }
}