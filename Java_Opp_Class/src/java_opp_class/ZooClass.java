
package java_opp_class;
import java.lang.*;
import java.util.Scanner;
public class ZooClass implements Zoo {
    
    String AnimalName;
    int AnimalNumbers;
    
    public ZooClass(){}
    
    public ZooClass(String AnimalName, int AnimalNumbers){
        this.AnimalName = AnimalName ;
        this.AnimalNumbers = AnimalNumbers ; 
    }
    
    public void ZCDetails(){
        System.out.println("Animal name = "+AnimalName);
        System.out.println("The number of Animals = "+AnimalNumbers);
    }
    
    public void area(){
        System.out.println("25sq");
    }
    
	/**name,numbers,area;
	ZooClass(String name, int AnimalNumbers, double area){
		this.name = name;
		this.AnimalNumbers = AnimalNumners ;
		this.area = area ;
	}
	System.out.println("ZooClass");
	
	public void Zoodetails(){
		System.out.println("The name of the zoo : "+name);
		System.out.println("Number of zoo animals : "+AnimalNumners);
		System.out.println("The size of the zoo : "+area);
	}**/
}