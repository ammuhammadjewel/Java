package Polymorphism;
public class MainEmployee {
    public static void main(String[] arg){

    EmpSalary s = new EmpSalary(1000, 2000, 3000);
    System.out.println("");
    Employee e = new Employee( );
    System.out.println("");
    e.setName("AAA");
    e.setId("20-***-1");
    e.setSalary(s);
    e.setPhoneNo("018*******");
    e.setEmail("aaaa@gmail.com");
    e.show();   
   }
}

/*public class MainEmployee {
    public static void main(String[] arg){
    Employee e = new Employee();
     e.show();
    System.out.println();
   
    EmpSalary s = new EmpSalary();
    System.out.println();
    s.show();
    
    }
    
}*/