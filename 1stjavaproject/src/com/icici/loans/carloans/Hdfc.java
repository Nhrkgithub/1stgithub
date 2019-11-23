package com.icici.loans.carloans;

public class Hdfc implements Rbi1stinterface {

	public static void main(String[] args) {
		
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("i am overridden withdrawl from hdfc");
		
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overridden withdrawl from hdfc");
		
		
	}

}
