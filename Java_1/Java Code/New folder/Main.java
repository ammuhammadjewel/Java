public class Main{​​​​​​​
    
    public static void main(String[] args) {​​​​​​​
        
        Contact s1 = new Contact ("Arif", "20-***-1", 20, "015*******1", 'M');
        Contact s2 = new Contact ("Ali", "20-***-1", 20, "018*******1", 'M');
        Contact s3 = new Contact ("Arab", "20-***-1", 20, "019*******1", 'M');
        Contact s4 = new Contact ("Araf", "20-***-1", 20, "017*******1", 'M');
        
        
        s1.showPersonInformation();
        s1.detectMobileOperator();
        System.out.println();
        
        s2.showPersonInformation();
        s2.detectMobileOperator();
        System.out.println();
        
        s3.showPersonInfo();
        s3.detectMobileOperator();
        System.out.println();
        
        s4.showPersonInformation();
        s4.detectMobileOperator();
        System.out.println();
        
    
    }​​​​​​​
}​​​​​​​
 