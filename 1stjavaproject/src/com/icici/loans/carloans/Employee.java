package com.icici.loans.carloans;

public class Employee 
{
	int eno;
	String ename;
	float sal;
	
	public Employee()
	{
		System.out.println("default");
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
	}
	public Employee(int eno)
	{
		this();
		this.eno=eno;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}


	public Employee(int eno, String ename) 
	{
		this(1745);
		this.eno=eno;
		this.ename=ename;	
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	public Employee(int eno, String ename, float sal) 
	{
		this(1744, "ravi");
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	public static void main(String[] args) 
	{
		
		
		new Employee(1746, "ravi", 12.34f);

	}
}
