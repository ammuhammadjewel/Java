
package com.toy.anagrams.lib;
class Person {
    
   
	private int    NidNumber;
    private String Name;
    private String DateOfBirth;
	private String Nationality;
	private String EducationLevel;
	private String BloodGroup;
	private String Gender;
	private int    AccountNumber;
	
   public Person(int nid,String n,String d,String nat,String e,String b,String g,int an){
	    this.NidNumber=nid;
        this.Name=n;
        this.DateOfBirth=d;
        this.Nationality=nat;
        this.EducationLevel=e;
        this.BloodGroup = b;
        this.Gender=g;
        this.AccountNumber=an;
		
	 
 }
 public void ShowPersonInfo(){
        
        System.out.println();
        System.out.println("Nid Number          : " + this.NidNumber);
        System.out.println("Name                : " + this.Name);
        System.out.println("Date of Birth       : " + this.DateOfBirth);
        System.out.println("Nationality         : " + this.Nationality);
        System.out.println("Education Level     : " + this.EducationLevel);
        System.out.println("Blood Group         : " + this.BloodGroup);
        System.out.println("Gender              : " + this.Gender);
        System.out.println("Acoount Number      : " + this.AccountNumber);

    }
}


class Employer extends Person{
	
    private String EmployerId;
    private double Revenue;
	
   public Employer(int nid, String n, String d,String nat, String e, String b, String g, int an, String ed, double r)
    {
        super(nid,n,d,nat,e,b,g,an);
        EmployerId=ed;
        Revenue=r;
		
		

    }
    public void ShowEmployerInfo(){

        

        
		ShowPersonInfo();
		System.out.println("Employer Id         : " + this.EmployerId);                  
        System.out.println("Revenue             : " + this.Revenue);
		
        
    }
}

 
 class Employee extends Person{

    private String EmployeeId;
    private String DateOfJoining;
    private double Salary;

 

    public Employee(int nid, String n, String d,String nat, String e, String b, String g, int an, String em, String doj, double sal)
    {
        super(nid,n,d,nat,e,b,g,an);
        EmployeeId=em;
        DateOfJoining=doj;
        Salary=sal;
		
		
    }
    public void ShowEmployeeInfo(){

 
        
        
		ShowPersonInfo();
        System.out.println("Employee Id         : " + this.EmployeeId);                  
        System.out.println("Date of Joining     : " + this.DateOfJoining);
        System.out.println("Salary              : " + this.Salary); 
		
    }
}

 class Programmer extends Employee{

 

    private double Bonus;
    private String Skills;

 

    public Programmer(int nid, String n, String d,String nat, String e, String b, String g, int an, String em, String doj, double sal,double bon, String s)
    {
        super(nid,n,d,nat,e,b,g,an,em,doj,sal);
        Bonus=bon;
        Skills=s;
		
		
    }
    public void ShowProgrammerInfo(){

        
        
        ShowEmployeeInfo();
        System.out.println("Bonus is            : " + this.Bonus);                  
        System.out.println("Skills is           : " + this.Skills); 
		
    }
}

 class Tester extends Employee{

    private double Bonus;
    private String Skills;

 

    public Tester(int nid, String n, String d,String nat, String e, String b, String g, int an, String em, String doj, double sal,double bon, String s)
    {
        super(nid,n,d,nat,e,b,g,an,em,doj,sal);
        Bonus = bon;
        Skills = s;
		
		
    }
    public void ShowTesterInfo(){

 
        
		ShowEmployeeInfo();
        System.out.println("Bonus               : " + this.Bonus);                  
        System.out.println("Skills              : " + this.Skills); 
		
    
}
 }
