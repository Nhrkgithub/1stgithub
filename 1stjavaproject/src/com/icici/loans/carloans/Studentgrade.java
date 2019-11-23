package com.icici.loans.carloans;

import java.util.Scanner;

public class Studentgrade {

	public static void main(String[] args)
	{
	
		int mark[] = new int[5];
		int i;
		float sum=0, avg;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter marks obtained in 5 subjects :");
		for(i=0; i<5; i++)
		{
			mark[i] = scan.nextInt();
			sum = sum + mark[i];
		}
		System.out.println("sum of 5 subjects :" +sum);
		avg = sum/5;
		 System.out.println("Avg of sub is:" +avg);
		 
		 System.out.println("your grade is");
		 if(avg>80)
		 {
			 System.out.println("A");
		 }
		 else if(avg>60 && avg<=80)
		 {
			 System.out.println("B");
		 }
		 else if(avg>40 && avg<=60)
		 {
			 System.out.println("C");
		 }
		 else
		 {
			 System.out.println("D");
		 }
	}
		

}
