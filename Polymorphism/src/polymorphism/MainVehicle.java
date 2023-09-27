package polymorphism;

public class MainVehicle {
    public static void main(String[] args){
        
        Vehicle v = new Vehicle("Mercedes-Benz",2045,4);
        v.show();
        System.out.println();
        
        Bike b = new Bike("s1000rr",4504,2,"BMW");
        b.show();
        System.out.println();
        
        Car c = new Car("F8 Tributo",1546,4,"Ferrari",2);
        c.show();
    }
    
}
