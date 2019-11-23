package com.icici.loans.educloans;

public class Stringdemo1buffer
{
 public static void main(String[] args)	
 {
	 StringBuffer s1=new StringBuffer("ravikant");
	 System.out.println(s1);
	 System.out.println(s1.hashCode());
	 
	 StringBuffer s2=new StringBuffer("ravikant");
	 System.out.println(s2);
	 System.out.println(s2.hashCode());	 
	 
	 s1=s1.append(s2);
	 System.out.println(s1);
	 System.out.println(s1.hashCode());
}
}
