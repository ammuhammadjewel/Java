package Polymorphism;

//import static com.oracle.jrockit.jfr.ContentType.Address;

public class Person {
    public String name ;
    protected int age ;
    Address address ;
    
    public Person(String name, int age, Address address)
    {
        this.name = name ;
        this.age = age ;
        this.address = address ;
    }
    public void showInfo()
    {
        System.out.println("Name: "+name) ;
        System.out.println("Age: "+age) ;
        System.out.println("House name: " +address.houseName+ " house No: " +address.getHouseNo()+ " Road No: "+address.roadNo) ;
    }
    
}
