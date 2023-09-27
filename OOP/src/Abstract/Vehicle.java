
package Abstract;
public abstract class Vehicle {
     String color;
     String model;
    
    Vehicle(String color, String model){
        this.color = color;
        this.model = model;
    }
    
    abstract void drive();
    abstract void stop();
    abstract void park();
    
    void horn(){
        System.out.println("Peeeeeep");
    }
    void show(){
        System.out.println("Vehicle color: "+color);
        System.out.println("Vehicle model: "+model);
    }
}
