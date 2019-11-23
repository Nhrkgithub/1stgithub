package com.icici.loans.carloans;

public class Operations
{
	int a,b,result;
	
	public Operations(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void add()
	{
		result=a+b;
		System.out.println("Addition of A & B is: " + result);
	}
public void sub()
{
	result=a-b;
	System.out.println("sub of A & B is: " + result);
}

	public static void main(String[] args) 
	{
		Operations o1=new Operations(10,20);
		o1.add();
		o1.sub();
		
		Operations o2=new Operations(100,200);
		o2.add();
		o2.sub();
	}

}
