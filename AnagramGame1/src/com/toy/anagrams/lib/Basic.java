
package com.toy.anagrams.lib;

public class Basic 
{
    public static void main(String arg[])
	{
		String s = "This is OOP1, Section : H";
		System.out.println("Length is : "+s.length());
		if(s.length() % 2 == 0)
		{
			System.out.println("Length is an even number ");
		}
		else
		{
			System.out.println("Length is an odd number");
		}
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf('T'));
	}
}
