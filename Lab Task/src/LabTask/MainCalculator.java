
package LabTask;
import java.util.Scanner;
public class MainCalculator {
    public static void main(String[] arg){
        Scanner inpout = new Scanner(System.in);
        Calculator c = new Calculator();
        
        System.out.println("Addition: "+c.add());
        System.out.println();
        System.out.println("Subtract: "+c.subtract());
        System.out.println();
        System.out.println("Multiply: "+c.multiply());
        System.out.println();
        System.out.println("Divide: "+c.divide());
        System.out.println();

        /**System.out.println("Add result = "+c.add);
        System.out.println("Subtract result =  ");
        System.out.println("multiply result = ");
        System.out.println("Divide result = ");*/
        
    }
    
}
