
package java_opp_class;
import java.lang.*;
import java.util.Scanner;
public class Bird extends Animal{
    //name,age,gender,gneder1,weightInLbs
    Bird(String name, int age, String gender, String gender1, int weightInLbs){
        
        super(name, age, gender, gender1, weightInLbs);
        
        /**this.age = age ;
        this.age = age;
        this.gender = gender ;
        this.gender1 = gender ;
        this.weightInLbs = weightInLbs ;**/
    }
	//System.out.println("Bird");
	public void fly(){
	System.out.println("Flying...");}
        
	public void Birdetails(){
		System.out.println("Bird name is :"+name);
		System.out.println("Bird age :"+age);
		System.out.println("Bird gender :"+gender);
		System.out.println("Bird gender1 :"+gender1);
	    System.out.println("Bird weightInLbs :"+weightInLbs);
	}
	
	
	
	/**public static void main(String[] args){
		Bird bird = new Bird("Charlie", 3, "M", "F", 15);
		Bird fly();
	}**/
}
	