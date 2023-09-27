import java.lang.*;
import java.util.Scanner;
public class Students {
	private int studentid;
	private String studentname;
	private boolean borrowed = false;
	private int amountborrowed = 0;
	private Books borrowBook[]= new Books[5];
	
	public Students() {  }
	
	public Students(int studentid, String studentname) {
		this.studentid = studentid;
		this.studentname = studentname;
	}
	


	public int getStudentId() {
		return studentid;
	}

	public void setStudentId(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentname;
	}

	public void setStudentName(String studentname) {
		this.studentname = studentname;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	

	public void setBorrowBookId(Books book,int s) {
		switch(s) {
		case 1://for borrowing
			for(int i=0;i<borrowBook.length;i++) {
				if(borrowBook[i] == null ) {
					borrowBook[i]=book;					
					break;
				}
				break;
			}
			break;
			
		case 2://For returning 
			for(int i=0;i<borrowBook.length;i++) {
				if(borrowBook[i] == book ) {
					borrowBook[i]=null;
					break;
				}
				break;
			}
			break;
		}
	}
		
	public int getAmountBorrowed() {
		return amountborrowed;
	}

	public void setAmountBorrowed(int amountborrowed) {
		this.amountborrowed = amountborrowed;
	}

	@Override
	public String toString() {
		if(borrowed==true) {
		return "Student [ID: " + studentid + ", Name: " + studentname + ", Borrow status: Yes " + "]";
		}
		else {
			return "Student [ID: " +  studentid + ", Name: " + studentname + ", Borrow status: No " + "]";
		}
	}

	public void showDetails(){
		try {
		
		if(borrowed==true) {
				System.out.println("Borrowed books:");
		for(int i=0;i<borrowBook.length;i++) {
			if(borrowBook[i]!=null) {
			System.out.println(borrowBook[i].toString());
			System.out.println();
			}
		}
		}
				}
		catch (NullPointerException a) { }
	}
	
	
	public static void main(String[] args) {
		

	}

	
	
	

}
 