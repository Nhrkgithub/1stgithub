package com.icici.loans.carloans;

public class Student1
{
	int sno;
	String sname;
	 public Student1(int sno, String sname) {
		 this.sno=sno;
		 this.sname=sname;
		 
	 }
public void studentdetails()
{
	System.out.println(sno);
	System.out.println(sname);
}
	public static void main(String[] args) {
		Student1 s1=new Student1(100,"ravi");
s1.studentdetails();
	}

}
