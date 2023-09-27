import java.lang.*;
import java.util.Scanner;
public class Start {

	public static void main(String[] args) {
		
		System.out.println("**********Welcome to Library Management System**********");
		System.out.println("\n");
		boolean repeat = true;
		Scanner scan= new Scanner(System.in);
	    Library l1 =new Library();
		do {
			System.out.println("Choose an option: ");
			System.out.println("	1. Add new Student");
			System.out.println("	2. Show all students");
			System.out.println("	3. Add new book");
			System.out.println("	4. Remove old book");
			System.out.println("	5. Borrow book");
			System.out.println("	6. Return book");
			System.out.println("	7. Show all books");
			System.out.println("	8. Show all available books");
			System.out.println("	9. Show all unavailable books");
			System.out.println("	10. Exit ");
			
			System.out.print("Your option : ");
			System.out.println();
			//Scanner scan= new Scanner(System.in);
			//Library l1 =new Library();
			int option1 = scan.nextInt();
			switch(option1) {
			
			case 1:
				System.out.println();
				l1.addStudent();
				System.out.println();
				break;
				
			case 2:
				System.out.println();
				l1.showAllstdnt();
				System.out.println();
				break;
				
			case 3:
				System.out.println();
				l1.addBooks();
				System.out.println();
				break;
				
			case 4:
				System.out.println();
				l1.removeBooks();
				System.out.println();
				break;
				
			case 5:
				System.out.println();
				l1.borrowBooks();
				System.out.println();
				break;
				
			case 6:
				System.out.println();
				l1.returnBooks();
				System.out.println();
				break;
				
			case 7:
				System.out.println();
				l1.showAllBooks();
				System.out.println();
				break;
			
			case 8:
				System.out.println();
				l1.showAvailBooks();
				System.out.println();
				break;
				
			case 9:
				System.out.println();
				l1.showUnavailBooks();
				System.out.println();
				break;
				
			case 10: 
				repeat=false;
				break;
				
			default:
	            System.out.println("Invalid Input");
	            break;
	            
			}
	
		}
		while(repeat==true);

	}

}
