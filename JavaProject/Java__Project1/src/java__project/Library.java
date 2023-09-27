
package java__project;

import java.lang.*;
import java.util.Scanner;
public class Library implements LibraryOperations , StudentOperations{
	private Books book[] = new Books[100];
	private Students student[] = new Students[100];
	Scanner scan= new Scanner(System.in);
	
	
	public void addStudent() {
		int flag=0; int tmp=0;
		System.out.println("Enter Student ID");
		int s_id= scan.nextInt();scan.nextLine();
		System.out.println("Enter Student Name");
		String s_name= scan.nextLine();
				
		for(int i=0;i<student.length;i++)	
		{
			if(student[i]== null)
			{
				student[i]= new Students(s_id, s_name);
			tmp=i;
			flag=1;
			break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Student has been successfully added");
			System.out.println("*************************************************");
			System.out.println(student[tmp].toString());
			System.out.println("*************************************************");
		}
		else
		{
			System.out.println("Student could not be added");
		}
		
	}
	
	
	public void showAllstdnt() {
		for(int i=0;i<student.length;i++)	
		{
			if(student[i]!= null)
			{
				System.out.println(student[i].toString());
				student[i].showDetails();
			
			
			}
			
		}
		
	}
	
	public void addBooks() {
		int flag=0; int tmp=0;
		System.out.println("Enter Book ID");
		int b_id= scan.nextInt();scan.nextLine();
		System.out.println("Enter Book Name");
		String b_name= scan.nextLine();
				
		for(int i=0;i<book.length;i++)	
		{
			if(book[i]== null)
			{
				book[i]= new Books(b_id, b_name);
			tmp=i;
			flag=1;
			break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Book has been successfully added");
			System.out.println("*************************************************");
			System.out.println(book[tmp].toString());
			System.out.println("*************************************************");
		}
		else
		{
			System.out.println("Book could not be added");
		}
		
	}
	
	public void removeBooks() {
		int flag=0;
		System.out.println("Enter Book ID");
		int b_id= scan.nextInt();scan.nextLine();
				
		for(int i=0;i<book.length;i++)	
		{
			if(book[i].getB_id()== b_id)
			{
				book[i]= null;
			
			flag=1;
			break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Book has been successfully removed");
			
		}
		else
		{
			System.out.println("Book could not be removed");
		}
		
	}
	
	public void borrowBooks() {
		int flag=0;
		try {
		System.out.println("Enter Book ID of the book");
		int b_id= scan.nextInt();scan.nextLine();
		System.out.println("Enter Student ID of the student");
		int s_id= scan.nextInt();scan.nextLine();
		
		for(int i=0;i<book.length;i++) {
			
			for(int j=0;j<student.length;j++) {
				
                 if(book[i].getB_id()==b_id && student[j].getS_id()==s_id && book[i].isAvail()==true && student[j].getAmountbrrd()<5) {
					
					book[i].setAvail(false);// book availability set to false
					book[i].setBrrS_id(student[j].getS_id());// setting the id of the borrowing student
					student[j].setBrrowd(true);// setting student borrow status to true
					student[j].setAmountbrrd(student[j].getAmountbrrd()+1);
					student[j].setBrrBkId(book[i],1);
					System.out.println("Book "+book[i].getB_name()+" has been succeesfully borrowed by Student "+student[j].getS_name());
					flag=1;
				}
                else if(book[i].getB_id()==b_id && student[j].getS_id()==s_id && book[i].isAvail()==true && student[j].getAmountbrrd()>=5) {
                	 System.out.println("You can not borrow more then 5 books at a time");
                }
                else if(book[i].getB_id()==b_id && student[j].getS_id()==s_id && book[i].isAvail()==false) {
               	 System.out.println("This book is currently unavailble");
               }
                
			}
		}
		}
		catch (NullPointerException a) {
			
		}
		if(flag==0) {System.out.println("Invalid response please try again");}
	}
	
	public void returnBooks() {
		int flag=0;
		try {
		System.out.println("Enter Book ID of the book");
		int b_id= scan.nextInt();scan.nextLine();
		System.out.println("Enter Student ID of the student");
		int s_id= scan.nextInt();scan.nextLine();
		
		for(int i=0;i<book.length;i++) {
			
			for(int j=0;j<student.length;j++) {
				
                 if(book[i].getB_id()==b_id && student[j].getS_id()==s_id && book[i].isAvail()==false && student[j].getAmountbrrd()>0) {
					
					book[i].setAvail(true);
					book[i].setBrrS_id(0);
					student[j].setAmountbrrd(student[j].getAmountbrrd()-1);
					student[j].setBrrBkId(book[i],2);
					System.out.println("Book "+book[i].getB_name()+" has been succeesfully returned by Student "+student[j].getS_name());
					flag=1;
					if(student[j].getAmountbrrd()==0) {
						student[j].setBrrowd(false);						
					}
				}
                
                
			}
		}
		}
		catch (NullPointerException a) { }
		if(flag==0) {System.out.println("Wrong ID please try again");}
	}
	
	public void showAllBooks() {
		try {
		for(int i=0;i<book.length;i++)	
		{
			if(book[i]!= null)
			{
				System.out.println(book[i].toString());
			
			
			}
			
		}
		}
		catch (NullPointerException a) { }
		
	}
	
	public void showAvailBooks() {
		try {
		for(int i=0;i<book.length;i++)	
		{
			if(book[i]!= null && book[i].isAvail()==true)
			{
				System.out.println(book[i].toString());
			
			
			}
			
		}
		}
		catch (NullPointerException a) { }
		
	}
	
	public void showUnavailBooks() {
		try {
		for(int i=0;i<book.length;i++)	
		{
			if(book[i]!= null && book[i].isAvail()==false)
			{
				System.out.println(book[i].toString());
			
			
			}
			
		}
		}
		catch (NullPointerException a) { }
		
	}

	public static void main(String[] args) {
		
		

	}

}
