
package Polymorphism;

public class Library {
    public String name;
public String address;
public Book book ;

public Library(){}

public Library(String name, String address, Book book){
    this.name = name;
    this.address = address;
    this.book = book;
    }
  void show(){
      System.out.println("Name: "+name);
      System.out.println("Address: "+address);
      System.out.println("Book: "+book);
  }
}


/*public class Library {
    public String name;
public String address;
public Book book[] ;

public Library(){}

public Library(String name, String address, Book book){
    this.name = name;
    this.address = address;
    this.book = book;
    }
  void show(){
      System.out.println("Name: "+name);
      System.out.println("Address: "+address);
      System.out.println("Book: "+book);
  }
}*/
