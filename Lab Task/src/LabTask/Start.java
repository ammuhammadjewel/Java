
package LabTask;

public class Start {
    
    public static void main(String[] arg){
        Vehicle v = new Vehicle("lambo","a-5",200000);
        v.showInformation();
        System.out.println();
        MotorBike m = new MotorBike("Ducati","a-4",100000,"Black","aaa","aaa@gmail.com");
        m.showInformation();
        System.out.println();
        Bike b = new Bike("lambo","a-3",50000,"aaa");
        b.showInformation();
        
    }
    
}
