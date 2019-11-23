package com.icici.loans.carloans;

public class Secondclass
{
 
	
	int a=10,b=20,c; //properties
	
	public void add() 
	{
		
	  c=a+b;
	  System.out.println("addition of A & B: " +c);
	}
	public void sub() 
	{
		
	  c=a-b;
	  System.out.println("subtraction of A & B: " +c);
	}
	
	public static void main(String[] args)
	{
	System.out.println("Helo");
	Secondclass obj=new Secondclass();
	obj.add();
	obj.sub();
	System.out.println(obj.c);
	
	Secondclass obj1=new Secondclass();
	obj1.add();
	obj1.sub();
	}
}
