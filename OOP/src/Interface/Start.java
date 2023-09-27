
package Interface;

public class Start {
    public static void main(String[] arg){
    
    Car c = new Car();
    System.out.println("Car Brand Name: "+c.brand);
    System.out.println("Car Model Name: "+c.modelName);
    
    c.show();
    
    System.out.println();
    c.method();
    c.method1();
    
   
    }
    
}
