package com.icici.loans.carloans;

public interface Rbi1stinterface
{
 public void withdrawl();
 public void deposit();
 
 public static void main(String[] args)
 {
		//Rbi1stinterface i=new Rbi1stinterface();
		
		/*Rbi1stinterface i=new icici();
		i.deposit();
		i.withdrawl();
		
		Rbi1stinterface i1=new hdfc();
		i.deposit();
		i.withdrawl();*/

	 
	 
	   Rbi1stinterface i;
	   
	   i=new icici();
	   i.deposit();
	   i.withdrawl();
 
	   
	   i=new Hdfc();
	   i.deposit();
	   i.withdrawl();
 }
}
