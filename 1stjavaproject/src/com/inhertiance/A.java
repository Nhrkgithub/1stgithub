package com.inhertiance;

import java.util.Date;

public class A
{
	public  int x=100;
	static String cname="vmware";
	
	
	
	public void m1()
	{
		x=200;
		cname="prolifics";
		System.out.println("i am m1 from class A");
		System.out.println(x);
		System.out.println(cname);
	}
	
	public static void main(String[] args)
	{
		A a=new A();
		a.m1();
		
		System.out.println(a.x);
		System.out.println(cname);
	}

}
