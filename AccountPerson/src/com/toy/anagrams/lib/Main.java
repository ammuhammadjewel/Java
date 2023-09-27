
package com.toy.anagrams.lib;

public class Main {
    
    public static void main(String[] args) {
		
		Person p1=new Person (215,"Muhi", "05-12-2028","Bangladeshi","Bsc", "O+", "Male", 5001);
		System.out.println("         Person Details         ");
		p1.ShowPersonInfo();
		System.out.println();
		System.out.println();
        Employer Er = new Employer(216,"Nafis", "25-08-1999","Bangladeshi","Bsc", "O+", "Male", 5002,"6008AB",26000d);
        System.out.println("         Employer Details        ");
		Er.ShowEmployerInfo();
		System.out.println();
		System.out.println();
        Employee Ee = new Employee(217,"Nidia ", "15-09-1999", "Bangladeshi","Bsc","O+", "Female", 5003, "4040RT", "14-02-2019",250000);
        System.out.println("           Employee Details          ");
        Ee.ShowEmployeeInfo();
		System.out.println();
		System.out.println();
        Programmer Pr = new Programmer(218," Zim", "25-03-2002", "Bangladeshi","Bsc"," 0+", "Female", 5006, "5050CR", "07-05-2020",55000d,22000d,"Java Specialist");
        System.out.println("           Programmer Details            ");
        Pr.ShowProgrammerInfo();
		System.out.println();
		}
    
}
