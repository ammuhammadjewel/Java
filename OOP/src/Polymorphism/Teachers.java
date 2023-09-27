
package Polymorphism;

public class Teachers {
    public static void main(String[] arg){
        Personn p = new Personn();
        p.displayInformation();
        
        System.out.println();
        
        p = new Teacher();
        p.displayInformation();
        
        System.out.println();
        
        p = new Student();
        p.displayInformation();
        
        System.out.println();
        
        
        
    }
    
}
