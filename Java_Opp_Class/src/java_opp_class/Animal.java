
package java_opp_class;
import java.lang.*;
import java.util.Scanner;
public class Animal {
    String name ;
	int age ;
	String gender ;
	String gender1 ;
	int weightInLbs ;
        
        public Animal(){}
	
	public Animal(String name, int age, String gender, String gender1, int weightInLbs){
		this.name = name ;
		this.age = age ;
		this. gender = gender ;
		this.weightInLbs = weightInLbs ;
	}
	//Syatem.out.println("Animal");
        
        public void eat(){
	System.out.print("Eating...");}
	public void sleep(){
	System.out.println("Sleeping...");}
	
	public void Anidetails(){
		System.out.println("Animal name is :"+name);
		System.out.println("Animal age :"+age);
		System.out.println("Animal gender :"+gender);
		System.out.println("Animal gender1 :"+gender1);
	    System.out.println("Animal weightInLbs :"+weightInLbs);
	}
	
	
	
	/**public static void main(String[] args){
		Animal animal = Animal("Cat", 5, "Male", "Female", 20)
		Animal eat();
		Animal sleep();
	}**/
    
}
