Lab task Contact
20-43243-1
    



public class Contact {​​​​​​​
    
    private String PersonName;
    private String PersonId;
    private int Age;
    private String MobileNumber;
    private char Gender;
    
    public Contact() {​​​​​​​
        
    }​​​​​​​
    
   
    public Contact(String PersonName, String PersonId, int Age, String MobileNumber, char Gender) {​​​​​​​
        super();
        this.PersonName = PersonName;
        this.PersonId = PersonId;
        this.Age = Age;
        this.MobileNumber = MobileNumber;
        this.Gender = Gender;
    }​​​​​​​
    

    public String getPersonName() {​​​​​​​
        return PersonName;
    }​​​​​​​
    public void setPersonName(String PersonName) {​​​​​​​
        this.PersonName = PersonName;
    }​​​​​​​
    public String getPersonId() {​​​​​​​
        return PersonId;
    }​​​​​​​
    public void setPersonId(String PersonId) {​​​​​​​
        this.PersonId = PersonId;
    }​​​​​​​
    public int getAge() {​​​​​​​
        return Age;
    }​​​​​​​
    public void setAge(int Age) {​​​​​​​
        this.Age = Age;
    }​​​​​​​
    public String getMobileNumber() {​​​​​​​
        return MobileNumber;
    }​​​​​​​
    public void setMobileNumber(String MobileNumber) {​​​​​​​
        this.MobileNumber = MobileNumber;
    }​​​​​​​
    public char getGender() {​​​​​​​
        return Gender;
    }​​​​​​​
    public void setGender(char Gender) {​​​​​​​
        this.Gender = Gender;
    }​​​​​​​
    
    
   
    public void showPersonInformation() {​​​​​​​
        
        System.out.println("Name   : "+PersonName);
        System.out.println("Id     : "+PersonId);
        System.out.println("Gender : "+Gender);
        System.out.println("Mobile : "+MobileNumber);
        
    }​​​​​​​
    
    
    
    public void detectMobileOperator() {​​​​​​​
    
        if(MobileNumber.charAt(2) == '7' || mobileNumber.charAt(2) == '3') {​​​​​​​
        System.out.println("TeleTalk Operator");
    }​​​​​​​
        else if(mobileNumber.charAt(2) == '9' || mobileNumber.charAt(2) == '4') {​​​​​​​
        System.out.println("Robi Operator");
    }​​​​​​​
        else if(mobileNumber.charAt(2) == '8') {​​​​​​​
            System.out.println("Banglalink Operator");
    }​​​​​​​
        else {​​​​​​​
        System.out.println("Gp Operator");
    }​​​​​​​


  }​​​​​​​
}​​​​​​​




​





