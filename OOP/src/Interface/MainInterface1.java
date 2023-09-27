
package Interface;
import java.lang.*;
public class MainInterface1 {
   public static void main(String[] args) {
		ClassCat cc = new ClassCat( "milk", 4, "black");

		System.out.println("Cat is Animal.");
		System.out.println("Cat eats " + cc.getEats()+".");
		System.out.println("Cat has " + cc.getNoOfLegs() + " legs.");
		System.out.println("Cat color is " + cc.getColor()+".");
                
                System.out.println();
                cc.method1();
                cc.method2();
                cc.method3();
                cc.method4();
	}

    
}
