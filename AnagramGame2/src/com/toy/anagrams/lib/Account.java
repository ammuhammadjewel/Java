
package com.toy.anagrams.lib;

public class Account {
    public String accountHolderName;
   private int accountNumber;
   private int balance;
   public int phoneNumber;
   public String email;
   public int age;
   public int perDayTransactionLimit;
   
	
	public Account()
	{
		
	}
	
	public Account(String accountHolderName,int accountNumber,int phoneNumber,String email,int age,int perDayTransactionLimit)
	{
		this.accountHolderName = accountHolderName ;
                this.accountNumber = accountNumber;
                this.phoneNumber=phoneNumber;
                 this.email=email;
          this.age=age;
         this.perDayTransactionLimit=perDayTransactionLimit;
 }
	
	public void setnum(int accountNumber) 
	{
		this.accountNumber= accountNumber;
                
	}
public void setbal(int balance)
{
 this.balance=balance;
}
	
	public int getnum()
	{
		return accountNumber ;
	}
      public int getbal()
{  
     return balance;
}
	void showInformation()
	{
		System.out.println("Account Holder Name: "+accountHolderName) ;
		
                 System.out.println("Phone Number : "+phoneNumber) ;
                  System.out.println("Email : "+email) ;
                  System.out.println("Age : "+age) ;
                 System.out.println("per Day Transaction Limit : "+perDayTransactionLimit) ;
                 
                   
                   
	}
     void withdrwal(int amount)
{
      System.out.println("Withdrwal amount is "+amount) ;
}
void diposite(int amount)
{
System.out.println("Deposite amount is "+amount) ;
}
    
}
