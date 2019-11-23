package com.icici.loans.educloans;

public class Stringdemo 
{

	public static void main(String[] args) 
	{
	String s1="ravi kanth";
	System.out.println();
		/*
		 * String[] s = s1.split(" "); System.out.println(s[0]);
		 * System.out.println(s[1]);
		 * 
		 * 
		 * System.out.println(s1.trim()); System.out.println(s1.charAt(0));
		 * System.out.println(s1.length()); System.out.println(s1.hashCode());
		 * System.out.println(s1.contains(s1)); System.out.println(s1.endsWith("nthe"));
		 * System.out.println(s1.indexOf('t')); System.out.println(s1.isEmpty( ));
		 */
	
	String s2=new String("lella");
	System.out.println(s2);
	System.out.println(s2.hashCode());
	
	s1=s1+s2;
	//s1=s1.concat(s2);
	System.out.println(s1);
	
	System.out.println(s1.equals(s2));
	}

}
