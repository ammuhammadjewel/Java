public class Main {
    
    public static void main(String arg[])
	{
		Account s1 = new Account("aaa",56221,12000,015,"google@gmail.com",20,20000);
                 s1.setnum(881423);
                  s1.setbal(80000);                 
                  System.out.println("Account Number  : "+s1.getnum()) ;
                   System.out.println("Account Balance : "+s1.getbal()) ;
		s1.showInformation() ;
                s1.withdrwal(5000);
                 s1.diposite(12000);
	}
    
}