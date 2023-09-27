import java.lang.*;

class Account
{
    int accountNumber;
    String accountHolderName;
    double balance;

    Account()
    {

 

    }
    Account(int accountNumber,String accountHolderName,double balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }


    void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName=accountHolderName;
    }
    void setBalance(double balance)
    {
        this.balance= balance;
    }

 

    int getAccountNumber()
    {
        return accountNumber;    
    }
    String getAccountHolderName()
    {
        return accountHolderName;
    }
    double getBalance()
    {
        return balance;
    }

 

    void showDetails()
    {
        System.out.println("Account Number         :    "+ accountNumber);
        System.out.println("Account Holder Name     :    "+ accountHolderName);
        System.out.println("Balance         :    "+ balance);
        System.out.println("");
    }

 

    void deposit(double amount)
    {
        this.balance = this.balance+ amount;
        System.out.println("Amount "+amount+" Deposited\n");
    }

 

    void withdraw(double amount)
    {
        if(this.balance > amount)
        {
            this.balance = this.balance - amount;
            System.out.println("Amount "+amount+" withdrawl successfull !");
        }
        else
        {
            System.out.println("Not Enough Balance\n ");
        }
    }

}