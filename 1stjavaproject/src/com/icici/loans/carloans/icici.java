package com.icici.loans.carloans;

public class icici implements Rbi1stinterface
{
	public static void main(String[] args)
{
	icici i=new icici();
	i.withdrawl();
	i.deposit();

	}

	@Override
	public void withdrawl()
	{
		System.out.println("i am overridden withdrawl from icici");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overridden deposit from icici");
		
	}

}
