
package LabTask;

public class Student {

  public String name;
  public String id;
  private float cgpa;
  public String courses[];
  
  public Student()
  {
  
  }

public Student(String name, String id, float cgpa,String courses[])  
{
  this.name= name;
  this.id=id;
  this.cgpa=cgpa;
  this.courses = courses;
}

public void setCgpa(float cgpa)
{ 
this.cgpa= cgpa;
}

public float getCgpa()
{
return cgpa ;
}
public void showInformation()
{
  System.out.println( "Student Name: "+name);
  System.out.println( "Student id: "+id);
  System.out.println( "Student Cgpa: "+cgpa);
  	
   for (int i=0; i<4; i++)
  {
     System.out.println( "Courses Name: "+(i+1)+":"+courses[i]);
  
  }
  
}
}
