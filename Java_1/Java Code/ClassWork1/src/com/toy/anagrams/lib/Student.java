
package com.toy.anagrams.lib;

class Student // Pascal Notation -> MyNameIsFahmida
{
	public String name ; // camel notation
	public String Id ;
	private float cgpa ;
	
	public Student()
	{
		
	}
	public Student(String name)
	{
		this.name = name ;
	}
	public Student(String name, String Id, float cgpa)
	{
		this.name = name ;
		this.Id = Id ;
		this.cgpa = cgpa ;
	}
	
	public void setCgpa(float cgpa) // Camel notation -> myNameIsFahmidaAlam
	{
		this.cgpa = cgpa ;
	}
	
	public float getCgpa()
	{
		return cgpa ;
	}
	void showInformation()
	{
		System.out.println("Name: "+name) ;
		System.out.println("ID: "+Id) ;
		System.out.println("Cgpa: "+cgpa) ;
	}

	
}