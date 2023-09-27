package Abstraction;

public class MainCalculation {
    public static void main(String args[]) { 

        ScientificCalculator SC1 = new ScientificCalculator(10,12); 

        System.out.println("Add: "+SC1.add()); 

        System.out.println("Sub: "+SC1.subtract()); 

        System.out.println("Multiply: "+SC1.multiply()); 

        System.out.println("Divide: "+SC1.divide()); 

        System.out.println("Power: "+SC1.toThePow()); 

    } 
       
}
