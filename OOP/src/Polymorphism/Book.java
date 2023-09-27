
package Polymorphism;

public class Book {
    public String bookName;
    public String authorName;
    public int noOfCopy;
    
    public Book(){}
    
    public Book(String bookName, String authorName, int noOfCopy){
        this.bookName = bookName;
        this.authorName = authorName;
        this.noOfCopy = noOfCopy;
    }
    
    void show(){
        System.out.println("Book Name: "+bookName);
        System.out.println("Author Name: "+authorName);
        System.out.println("No Of Copy: "+noOfCopy);
    }
    
}
