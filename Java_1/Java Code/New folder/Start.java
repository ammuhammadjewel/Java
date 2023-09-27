public class Start {​​​​​​​
    
public static void main(String[] args) {​​​​​​​
        
        Book s1 = new Book("Java", "Bert Bates", "20-***-1", "Programming", 44);
        
        s1.showInformations();
        System.out.println("\n");
        s1.AddBookCopy(44);
        s1.showInformations();


        System.out.println("\n");
        s1.showTotalBookInformations();
        System.out.println("\n");
        
        Book s2 = new Book("C++","Josee lajoie", "20-***-2", "Programming", 44);
        s2.showInfo();


        System.out.println("\n");
        
        Book.showTotalBookInformation();


    }​​​​​​​


}​​​​​​​
 