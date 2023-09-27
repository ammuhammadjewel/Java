
package Abstraction;

abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Pig Sleep: Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() { 
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}
public class Main1{
    public static void main(String[] arg){
        Pig p = new Pig(); // Create a Pig object
        p.animalSound();
        p.sleep();
    }
}
