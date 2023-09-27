
package Abstract;
public class Car extends Vehicle {

     int doors;
   
    
    public Car(String color, String model, int doors) {
        super(color, model);
        this.doors = doors;
        
    }
    
     @Override
    void show(){
        System.out.println("Car color: "+color);
        System.out.println("Car model: "+model);
        System.out.println("Car doors: "+doors);
    }

    @Override
    void drive() {
        System.out.println("Car is in drive mode");
    }

    @Override
    void stop() {
        System.out.println("Car is in stop mode");
    }

    @Override
    void park() {
        System.out.println("Car is in park mode");
    }
}
