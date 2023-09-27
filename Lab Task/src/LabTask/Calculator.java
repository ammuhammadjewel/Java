
package LabTask;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    	double x, y;
        Scanner inpout = new Scanner(System.in);
        System.out.print("Enter first number:");

        
        x = inpout.nextDouble();
        System.out.print("Enter second number:");
        y = inpout.nextDouble();
        
        double add = x + y;
        System.out.println("Add of two numbers = "+add);
        
        double subtract = x - y;
        System.out.println("subtract of two numbers = "+subtract);
        
        double multiply = x * y;
        System.out.println("Multiply of two numbers = "+multiply);
        
        double divide = x / y;
        System.out.println("Divide of two numbers = "+divide);


    }
}
