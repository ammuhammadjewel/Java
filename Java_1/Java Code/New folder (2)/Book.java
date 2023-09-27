
public class Book {​​​​​​​
    
    //Attributes
    private String bookName;
    private String bookAuthor;
    private String bookId;
    private String bookType;
    private int bookCopy; // how many copy
    private static int bookCounter;
    
    
    //Empty Constructor
    public Book() {​​​​​​​
        
        bookCounter += 1;
    }​​​​​​​
    
    //Parameterized Constructor
    public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {​​​​​​​
        
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookType = bookType;
        this.bookCopy = bookCopy;
        bookCounter += 1;
    }​​​​​​​
    
    
    //Getter & Setter
    public String getBookName() {​​​​​​​
        return bookName;
    }​​​​​​​
    public void setBookName(String bookName) {​​​​​​​
        this.bookName = bookName;
    }​​​​​​​
    public String getBookAuthor() {​​​​​​​
        return bookAuthor;
    }​​​​​​​
    public void setBookAuthor(String bookAuthor) {​​​​​​​
        this.bookAuthor = bookAuthor;
    }​​​​​​​
    public String getBookId() {​​​​​​​
        return bookId;
    }​​​​​​​
    public void setBookId(String bookId) {​​​​​​​
        this.bookId = bookId;
    }​​​​​​​
    public String getBookType() {​​​​​​​
        return bookType;
    }​​​​​​​
    public void setBookType(String bookType) {​​​​​​​
        this.bookType = bookType;
    }​​​​​​​
    public int getBookCopy() {​​​​​​​
        return bookCopy;
    }​​​​​​​
    public void setBookCopy(int bookCopy) {​​​​​​​
        this.bookCopy = bookCopy;
    }​​​​​​​
     
    
    public void addBookCopy(int x) {​​​​​​​
           bookCopy += x;
    }​​​​​​​
    
    
    //ShowInfo
    public void showInfo() {​​​​​​​
        System.out.println("Book Name   : "+bookName);
        System.out.println("Book Author : "+bookAuthor);
        System.out.println("Book ID     : "+bookId);
        System.out.println("Book Type   : "+bookType);
        System.out.println("Book Copy   : "+bookCopy);
    }​​​​​​​
 
    public static void showTotalBookInfo() {​​​​​​​
        
        System.out.println("Total Book Object :"+bookCounter);
    }​​​​​​​
     
 }​​​​​​​



​
    
package final_assignment;


public class MainActivity_Book {​​​​​​​
    
public static void main(String[] args) {​​​​​​​
        
        Book book = new Book("Java", "James Gosling", "24***-1", "Programming Language", 10);
        
        book.showInfo();
        System.out.println("\n");
        book.addBookCopy(12);
        book.showInfo();


        System.out.println("\n");
        Book.showTotalBookInfo();
        System.out.println("\n");
        
        Book book2 = new Book("C++","Guido van Rossum", "29***-2", "Programming Language", 12);
        book2.showInfo();


        System.out.println("\n");
        
        Book.showTotalBookInfo();


    }​​​​​​​


}​​​​​​​
 






