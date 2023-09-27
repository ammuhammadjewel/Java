package Polymorphism;
public class Employee {
    
    public String name;
    public String id;
    private EmpSalary salary ;
    private String phoneNo;
    public String email; 

    public Employee()
    {

    }
  
    public Employee(String name, String id, EmpSalary salary, String phoneNo, String email)
   {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.id = id;
      this.salary = salary;
      this.email = email;
      this.phoneNo=phoneNo;
   }

    public EmpSalary getSalary()
    {
        return salary;
    }
    public void setSalary(EmpSalary salary) 
    {
     this.salary = salary;
    }
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return name;
    }
    public String getPhoneNo()
    {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo){
       this. phoneNo = phoneNo;
    }
    public void setId(String id)
    {
      this.id=id;
    }
    public String getId()
    {
      return id;
    }
    public void setEmail(String email)
    {
      this.email=email;
    }
    public String getEmail()
    {
      return email;
    }
    void show(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);

        System.out.println("Basic Amount: "+salary.getBasicAmount());
        System.out.println("Festival Bonus: "+salary.getFestivalBonus());
        System.out.println("Over time Amount: "+salary.getOvertimeAmount());

        System.out.println("Employee Phone No: "+phoneNo);
        System.out.println("Employee Email: "+email);
        System.out.println("");
        
    }
}
/*public class Employee {
    
    public String Name;
    public String ID ;
    private EmpSalary salary ;
    private String phoneNo ;
    public String email ; 

    public Employee(){}
    
    
    public Employee(String Name, String ID, EmpSalary salary, String phoneNo, String email) {
      System.out.println("Constructing an Employee");
      this.Name = Name;
      this.ID = ID;
      this.salary = salary;
      this.email = email;
      
   }
    
    public EmpSalary getsalary(){
        return salary;
    }
    public void setsalary(String salary) {
      salary = salary;
   }
    public String getphoneNo(){
        return phoneNo;
    }
    public void setphoneNo(){
        phoneNo = phoneNo;
    }
    void show(){
        System.out.println("Employee Name: "+Name);
        System.out.println("Employee ID: "+ID);
        System.out.println("Employee salary: "+salary);
        System.out.println("Employee Phone No: "+phoneNo);
        System.out.println("Employee Email: "+email);
        
    }

    
}
*/