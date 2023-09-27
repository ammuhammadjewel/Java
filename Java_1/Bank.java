public class Bank 

{ 

    private int BanAaccountNumber; //accountNumber Account

    private String BankAccountHolderName; //accountHolderName

    private double BankBalance; //balance

  

    public Bank() 

     { 

        System.out.println("default constructor");

     } 

    public Bank(int ban,String bahn, double b) 

     { 

         BanAaccountNumber=ban; 

         BankAccountHolderName=bahn; 

         BankBalance =b; 

     } 

     public void setAccountNumber(int ban) 

     { 

         BanAaccountNumber=ban; 

     } 

     public int getAccountNumber() 

     { 

        return BanAaccountNumber; 

     } 

     public void setAccountHolderName(String bahn) 

     { 

        BankAccountHolderName=bahn; 

     } 

     public String getAccountHolderName() 

     { 

        return BankAccountHolderName; 

     } 

     public void  setBalance(double b) 

     { 

         BankBalance =b; 

     } 

     public double getBalance() 

     { 

        return BankBalance; 

     } 

   

public void showDetails() 

  { 

    System.out.println("Bank Account Number :"+BanAaccountNumber); 

    System.out.println("Bank Account Holder Name :"+BankAccountHolderName); 

    System.out.println("Bank Balance :"+BankBalance); 

  } 

public static void main(String args[]) 

     { 

        Bank a1=new Bank(11111,"Sani",50000.0); 

        a1.showDetails(); 

        a1.setAccountNumber(7002); 

        int BanAaccountNumber = a1.getAccountNumber(); 

        a1.setAccountHolderName("Arab"); 

        String BankAccountHolderName = a1.getAccountHolderName(); 

        a1.setBalance(8000.0); 

        double BankBalance = a1.getBalance(); 

        a1.showDetails();   

     } 

}