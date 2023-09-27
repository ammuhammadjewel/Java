
package com.toy.anagrams.lib;

class Student 
{
	public String name ;
	public String id ;
	private float cgpa ;
	
	public Student()
	{
		System.out.println("default constructor");
	}
	
	public Student(String name, String id, float cgpa)
	{
		this.name = name ;
		this.id = id ;
		this.cgpa = cgpa ;
	}
	
	public void setCgpa(float cgpa) 
	{
		this.cgpa = cgpa ;
	}
	
	public float getCgpa()
	{
		return cgpa ;
	}
	void showInformation()
	{
		System.out.println("Student Name: "+name) ;
		System.out.println("Student Id: "+id) ;
		System.out.println("Student Cgpa: "+cgpa) ;
	}

	
}