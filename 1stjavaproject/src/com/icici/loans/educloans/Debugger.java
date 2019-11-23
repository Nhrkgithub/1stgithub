package com.icici.loans.educloans;

import java.util.Scanner;

public class Debugger
{
	
public int arraycode()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size:");
	int asize=sc.nextInt();
	
	int[] a=new int[asize];
	int sum=0;
	
	System.out.println("enter the array elements:");
	for(int i=0; i<a.length; i++)
	{
		System.out.print("a["+i+"]=");
		a[i]=sc.nextInt();
		sum=sum+a[i];
	}
System.out.println("sum of the arraya is:" +sum);
return sum;

}
public static void main(String[] args)
{
	Debugger d=new Debugger();
	int count = d.arraycode();
	System.out.println("count in outside: " +count);
}
}
