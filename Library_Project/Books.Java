import java.lang.*;
import java.util.Scanner;

public  class Books {
	private int b_id;
	private String b_name;
	private boolean avail=true;
	private int brrS_id;
	
	public Books() {  }

	public Books(int b_id, String b_name) {
		this.b_id = b_id;
		this.b_name = b_name;
	}
	
	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public boolean isAvail() {
		return avail;
	}

	public void setAvail(boolean avail) {
		this.avail = avail;
	}
	
	public int getBrrS_id() {
		return brrS_id;
	}

	public void setBrrS_id(int brrS_id) {
		this.brrS_id = brrS_id;
	}

	@Override
	public String toString() {
		if(avail==true) {
		return "Book [ID: " + b_id + ", Name: " + b_name + ", Available: Yes" + "]";
		}
		else {
			
			return "Book [ID: " + b_id + ", Name: " + b_name + ", Available: No" + "]" + "\n Borrowed by student ID "+brrS_id;
		}
	}

	public static void main(String[] args) {
		

	}

}
