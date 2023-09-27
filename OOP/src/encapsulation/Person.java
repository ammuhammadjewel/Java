
package encapsulation;

public class Person {
    /*private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }*/
    


String name;
    int age;
    void eat(){
        //System.out.println("Age :"+age);
        
    }
    void talk(){
        
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        
    }
}