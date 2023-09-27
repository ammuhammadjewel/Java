
package Polymorphism;
import java.lang.*;
public class Vehicle {
    String name;
   int plateNumber;
   int wheelNumber;
    
   
   public Vehicle(){}
   public Vehicle(String name, int plateNumber, int wheelNumber){
       this.name = name;
       this.plateNumber = plateNumber;
       this.wheelNumber = wheelNumber;
   }
public void start(){
    System.out.println("starting engine... ");
}
public void Break(){
    System.out.println("Break ");
}
public void stop(){
    System.out.println("stopping engine... ");
}
public void show(){
    System.out.println("Vehicle name: "+name);
    System.out.println("Vehicle Plate Number: "+plateNumber);
    System.out.println("Vehicle wheel Number: "+wheelNumber);
}

}
