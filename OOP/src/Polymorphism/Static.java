
package Polymorphism;

class MyClass {
    
    int height;
    
    MyClass(){
        System.out.println("Bricks");
        height = 100;
    }
    MyClass(int i){
        System.out.println("Building new house that is " + i + " feet tall");
        height = i ;
    }
    void info(){
        System.out.println("House is " + height + " fett tall");
    }
    void info(String s){
        System.out.println(s+ ": House is " +height+ " feet tall");
    }
}

public class Static{
    public static void main(String[]args){
        MyClass s = new MyClass(0);
        s.info();
        s.info("over loaded method");
        //over loaded constructor
        new MyClass();
        
    }
}
