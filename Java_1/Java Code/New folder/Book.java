  
public class Book 
{​​​​​​​
    
    private String BookName;
    private String BookAuthor;
    private String BookId;
    private String BookType;
    private int BookCopy; 
    private static int BookCounter;
    
    public Book() {​​​​​​​
        
        bookCounter += 1;
    }​​​​​​​
    
    public Book(String BookName, String BookAuthor, String BookId, String BookType, int BookCopy) {​​​​​​​
        
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.BookId = BookId;
        this.BookType = BookType;
        this.BookCopy = BookCopy;
        BookCounter += 1;
    }​​​​​​​
    
    public String getBookName()
	{​​​​​​​
        return BookName;
    }​​​​​​​
    public void setBookName(String BookName) {​​​​​​​
        this.BookName = BookName;
    }​​​​​​​
    public String getBookAuthor() {​​​​​​​
        return BookAuthor;
    }​​​​​​​
    public void setBookAuthor(String BookAuthor) {​​​​​​​
        this.BookAuthor = BookAuthor;
    }​​​​​​​
    public String getBookId() {​​​​​​​
        return BookId;
    }​​​​​​​
    public void setBookId(String BookId) {​​​​​​​
        this.BookId = BookId;
    }​​​​​​​
    public String getBookType() {​​​​​​​
        return BookType;
    }​​​​​​​
    public void setBookType(String BookType) {​​​​​​​
        this.BookType = BookType;
    }​​​​​​​
    public int getBookCopy() {​​​​​​​
        return BookCopy;
    }​​​​​​​
    public void setBookCopy(int BookCopy) {​​​​​​​
        this.BookCopy = BookCopy;
    }​​​​​​​
     
    
    public void AddBookCopy(int a) {​​​​​​​
           BookCopy += a;
    }​​​​​​​
    
 
    public void showInformations() {​​​​​​​
        System.out.println("Book Name   : "+BookName);
        System.out.println("Book Author : "+BookAuthor);
        System.out.println("Book ID     : "+bookId);
        System.out.println("Book Type   : "+BookType);
        System.out.println("Book Copy   : "+BookCopy);
    }​​​​​​​
 
    public static void showTotalBookInformations() {​​​​​​​
        
        System.out.println("Total Book Object :"+BookCounter);
    }​​​​​​​
     
 }​​​​​​​











