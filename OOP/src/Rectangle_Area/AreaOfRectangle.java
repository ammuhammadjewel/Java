
package Rectangle_Area;
import java.util.Scanner;

public class AreaOfRectangle {
    
    public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Enter the length of Rectangle: ");
	   double length = scanner.nextDouble();
	   System.out.print("Enter the width of Rectangle: ");
	   double width = scanner.nextDouble();
	   //Area = length*width;
	   double area = length*width;
           System.out.println();
	   System.out.println("Area of Rectangle is: "+area);
           
           
   }
    
}
/*{
	   double length = 4.5;
	   double width = 8.0;
	   double area = length*width;
	   System.out.println("Area of Rectangle is:"+area);
   }*/