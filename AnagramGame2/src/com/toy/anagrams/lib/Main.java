
package com.toy.anagrams.lib;

public class Main {
    
    public static void main(String arg[])
	{
		Account s1 = new Account("aaa",15,015,"mail",20,101);
                 s1.setnum(5526);
                  s1.setbal(91620);                 
                  System.out.println("Account Number  : "+s1.getnum()) ;
                   System.out.println("Account Balance : "+s1.getbal()) ;
		s1.showInformation() ;
                s1.withdrwal(4523);
                 s1.diposite(15682);
	}
    
}
