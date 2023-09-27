
package Interface;
import java.lang.*;
public class ClassCat extends ClassAnimal implements interface2 {
    
    private String color;

	public ClassCat( String food, int legs) {
		super(food, legs);
		this.color="White";
	}

	public ClassCat( String food, int legs, String color){
		super(food, legs);
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
        @Override
        public void method1(){
            System.out.println("implementation of method1");
        }
        
        @Override
        public void method2(){
            System.out.println("implementation of method2");
        }
        @Override
        public void method3(){
            System.out.println("implementation of method3");
        }
        @Override
        public void method4(){
            System.out.println("implementation of method4");
        }

}
