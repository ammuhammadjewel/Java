import java.lang.*;

class Start
{
    public static void main(String[] args) 
    {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();
        Account a4 = new Account();
        Account a5 = new Account();

 

        a1.setAccountNumber(1);
        a1.setAccountHolderName("A");
        a1.setBalance(10000);

 

        a2.setAccountNumber(2);
        a2.setAccountHolderName("B");
        a2.setBalance(1000);

 

        a3.setAccountNumber(3);
        a3.setAccountHolderName("C");
        a3.setBalance(10050);

 

        a4.setAccountNumber(4);
        a4.setAccountHolderName("D");
        a4.setBalance(5000);

 

        a5.setAccountNumber(5);
        a5.setAccountHolderName("E");
        a5.setBalance(20000);
        

 

        Account myAccount[]={a1,a2,a3,a4,a5};

 

        for (int i=0;i<5 ;i++ )
        {
            myAccount[i].showDetails();
            
        }

 

        a2.deposit(500);
        a5.withdraw(1000);
        a3= null;

 

        for (int i=0;i<5 ;i++ )
        {
            myAccount[i].showDetails();
            
        }
    }
}