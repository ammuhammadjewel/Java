public class Contact {​​​​​​​
    
    //Attributes
    private String personName;
    private String personId;
    private int age;
    private String mobileNumber;
    private char gender; // M or F
    
    
    //Empty Constructor
    public Contact() {​​​​​​​
        
    }​​​​​​​
    
    
    //Parameterized Constructor
    public Contact(String personName, String personId, int age, String mobileNumber, char gender) {​​​​​​​
        super();
        this.personName = personName;
        this.personId = personId;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
    }​​​​​​​
    
    
    //Getter & Setter
    public String getPersonName() {​​​​​​​
        return personName;
    }​​​​​​​
    public void setPersonName(String personName) {​​​​​​​
        this.personName = personName;
    }​​​​​​​
    public String getPersonId() {​​​​​​​
        return personId;
    }​​​​​​​
    public void setPersonId(String personId) {​​​​​​​
        this.personId = personId;
    }​​​​​​​
    public int getAge() {​​​​​​​
        return age;
    }​​​​​​​
    public void setAge(int age) {​​​​​​​
        this.age = age;
    }​​​​​​​
    public String getMobileNumber() {​​​​​​​
        return mobileNumber;
    }​​​​​​​
    public void setMobileNumber(String mobileNumber) {​​​​​​​
        this.mobileNumber = mobileNumber;
    }​​​​​​​
    public char getGender() {​​​​​​​
        return gender;
    }​​​​​​​
    public void setGender(char gender) {​​​​​​​
        this.gender = gender;
    }​​​​​​​
    
    
    
    //Show Info
    public void showPersonInfo() {​​​​​​​
        
        System.out.println("Name   : "+personName);
        System.out.println("Id     : "+personId);
        System.out.println("Gender : "+gender);
        System.out.println("Mobile : "+mobileNumber);
        
    }​​​​​​​
    
    
    
    public void detectMobileOperator() {​​​​​​​
    
        if(mobileNumber.charAt(2) == '7' || mobileNumber.charAt(2) == '3') {​​​​​​​
        System.out.println("GP Operator");
    }​​​​​​​
        else if(mobileNumber.charAt(2) == '9' || mobileNumber.charAt(2) == '4') {​​​​​​​
        System.out.println("Banglalink Operator");
    }​​​​​​​
        else if(mobileNumber.charAt(2) == '8') {​​​​​​​
            System.out.println("Robi Operator");
    }​​​​​​​
        else {​​​​​​​
        System.out.println("Other Operator");
    }​​​​​​​


  }​​​​​​​
}​​​​​​​