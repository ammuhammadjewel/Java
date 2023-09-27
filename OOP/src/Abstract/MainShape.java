package Abstract;

public class MainShape {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width);
        System.out.println("length: " + length);
        System.out.println("Resulting area: " + rectangle.area());
        System.out.println("Resulting perimeter: \" + rectangle.perimeter() + \"\n");
        

        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius);
        System.out.println("Resulting Area: " + circle.area());
        System.out.println("Resulting Perimeter: " + circle.perimeter() + "\n");
            

        // Triangle test
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c);
        System.out.println("Resulting Area: " + triangle.area());
        System.out.println("Resulting Perimeter: " + triangle.perimeter() + "\n");
                
    }
    
}