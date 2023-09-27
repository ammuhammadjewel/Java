
package Interface;

public class Car extends Vehicle implements I2 {
  String modelName = "r4"; 
  
  @Override
  public void method(){
      System.out.println("I am from I1");
      
  }
  @Override
  public void method1(){
      System.out.println("I am from I2");
      
  }
    
}
