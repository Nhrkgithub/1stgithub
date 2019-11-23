package com.icici.loans.carloans;

public class Childclass extends Firstabstract
{

	public static void main(String[] args)
	{
		
Childclass c=new Childclass();
c.m1();
c.m2();
	}
public void m1()
{
	System.out.println(" i am m1 overidden method in class childclass");
}
	@Override
	public void m2() 
	{
		System.out.println("i am overidden m2 from childclass");
		
	}

}
