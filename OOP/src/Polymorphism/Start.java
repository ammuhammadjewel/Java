package Polymorphism;

/*public class Start {
    public static void main(String args[]){
        Address a = new Address("Sample,", "a20,", "b22,") ;
        Person p = new Person("abc", 20, a) ;
        p.showInfo() ;
        System.out.println();
    }
    
}

class Library 
{
    public String name;
    public String address;
    public Book book[] ;
    public Library()
    {

    }
    public Library( String name,String address,Book book)

    {
        this.name=name;
        this.address=address;
        this.book=book;

    }
    public void show()
    {
        System.out.println("Book Name: "+name);
        System.out.println("Author Name: "+address);
        System.out.println("No Of Copy: "+book);
    }*/
class Library{
public String name;
    public String address;
    public Book book ;
    public Library()
    {

    }
    public Library( String name,String address,Book book)

    {
        this.name=name;
        this.address=address;
        this.book=book;

    }
    public void show()
    {
        System.out.println("Book Name: "+name);
        System.out.println("Author Name: "+address);
        System.out.println("No Of Copy: "+book);
    }
}
    //import java .lang.*;

public class Start
{
 public static void main(String[] arg)
 {
    Library l=new Library();
    l.show();
            }
}
