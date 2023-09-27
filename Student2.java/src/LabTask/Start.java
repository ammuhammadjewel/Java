
package LabTask;

public class Start {

public static void main(String arg[])
{ 
    System.out.println("\n");
 
String s1[]= new String[]{"Java","DisMath","Ph2","Math"};
Student s2= new Student ("aaa", "20-***-1", 4.0f, s1);
s2.showInformation();
System.out.println();
String s3[]= new String[]{"C++","Math","Ph","Eng"};
Student s4= new Student ("bbb", "20-***-1", 4.0f, s3);
s4.showInformation();

}
}
