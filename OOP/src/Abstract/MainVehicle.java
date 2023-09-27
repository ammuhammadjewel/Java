
package Abstract;

public class MainVehicle {
    public static void main(String[] args) {
        
        //Vehicle Vehicle;
        
       Vehicle Car = new Car("White","McLaren",2);
       Car.show();
       Car.drive();
       Car.stop();
       Car.park();
       Car.horn();
       
       System.out.println();
       
       Vehicle Bike = new Bike("Black", "r15",150000,"Yamaha");
       Bike.show();
       Bike.drive();
       Bike.stop();
       Bike.park();
       Bike.horn();
    }
    
}
