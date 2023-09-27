
package com.toy.anagrams.lib;

public class Employee {
    public String ename;
    public String eid;
    public int eage;
    public double esalary;
    
    public Employee(){
    System.out.println("This ids a Default Constructor");
    
    }
    public Employee(String ename, String eid, int eage, double esalary)
    {
    this.ename=ename;
    this.eid=eid;
    this.esalary=esalary;
    }
    public void setSalary(double esalary){
    this.esalary=esalary;
    }
    public double getSalary()
    {
    return esalary;
    }
    public void print()
    {
    System.out.println("Employee name: "+ename);
    System.out.println("Employee id: "+eid);
    System.out.println("Employee age: "+eage);
    System.out.println("Employee salary: "+esalary);
    }
}
