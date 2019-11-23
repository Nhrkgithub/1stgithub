package com.icici.loans.carloans;

public class Childclass1 extends Employee
{
	String address;
	String state;
	
	public Childclass1(String address)
	{
		super(1745,"keerthan",12.34f);
		this.address=address;
		
		System.out.println(this.address);
	}
	public Childclass1(String address, String state)
	{
		this("ap");
		this.address=address;
		this.state=state;
		
		System.out.println(this.address);
		System.out.println(this.state);
		
	}
	public static void main(String[] args) 
	{
		
    Childclass1 c=new Childclass1("hyd");
	}

}
