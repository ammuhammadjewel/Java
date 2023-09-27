
package inheritance;

public class Teacher extends Person {
    
    String qualification;
    
    void displayInformation2(){
        //System.out.println("Nmae: "+name);
        //System.out.println("Age: "+age);
        displayInformation1();
        System.out.println("Qualification: "+qualification);
    }
    
}
