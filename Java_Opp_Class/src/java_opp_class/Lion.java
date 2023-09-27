
package java_opp_class;
import java.lang.*;
import java.util.Scanner;
public class Lion extends Animal{
	//name,age,gender,gender1,weightInLbs
	String colour ;
	int legsNum ;
	double length ;
	double height ;

	public Lion(String name, int age, String gender, String gender1, int weightInLbs, String colour, int legsNum, int length, int height){
		this.name = name;
		this.age = age ;
		this.gender = gender ;
		this.gender1 = gender1 ;
		this.weightInLbs = weightInLbs ;
		this.colour = colour ;
		this.legsNum = legsNum ;
		this.length = length ;
		this.height = height ;
	}
	
	//System.out.println("Lion");
	
	public void Liodetails(){
		System.out.println("Animal name : "+name);
		System.out.println("The age of the Lion : "+age);
		System.out.println("The gender of the Lion : "+gender);
		System.out.println("The gender1 of the Lion : "+gender1);
		System.out.println("The weight of the Lion : "+weightInLbs);
		System.out.println("The colour of the Lion : "+colour);
		System.out.println("The number of lion's feet  : "+legsNum);
		System.out.println("The length of the lion  : "+length);
		System.out.println("The height of the lion  : "+height);
        }
}