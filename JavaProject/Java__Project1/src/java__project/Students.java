
package java__project;
import java.lang.*;
import java.util.Scanner;
public class Students {
	private int s_id;
	private String s_name;
	private boolean brrd = false;
	private int amountbrrd = 0;
	private Books brrBook[]= new Books[5];
	
	
	public Students() {  }
	
	public Students(int s_id, String s_name) {
		this.s_id = s_id;
		this.s_name = s_name;
	}
	


	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public boolean isBrrd() {
		return brrd;
	}

	public void setBrrowd(boolean brrd) {
		this.brrd = brrd;
	}

	

	public void setBrrBkId(Books book,int s) {
		switch(s) {
		case 1://for borrowing
			for(int i=0;i<brrBook.length;i++) {
				if(brrBook[i] == null ) {
					brrBook[i]=book;					
					break;
				}
				break;
			}
			break;
			
		case 2://For returning 
			for(int i=0;i<brrBook.length;i++) {
				if(brrBook[i] == book ) {
					brrBook[i]=null;
					break;
				}
				break;
			}
			break;
		}
	}
		
	public int getAmountbrrd() {
		return amountbrrd;
	}

	public void setAmountbrrd(int amountbrrd) {
		this.amountbrrd = amountbrrd;
	}

	@Override
	public String toString() {
		if(brrd==true) {
		return "Student [ID: " + s_id + ", Name: " + s_name + ", Borrow status: Yes " + "]";
		}
		else {
			return "Student [ID: " + s_id + ", Name: " + s_name + ", Borrow status: No " + "]";
		}
	}

	public void showDetails(){
		try {
		
		if(brrd==true) {
				System.out.println("Borrowed books:");
		for(int i=0;i<brrBook.length;i++) {
			if(brrBook[i]!=null) {
			System.out.println(brrBook[i].toString());
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
 