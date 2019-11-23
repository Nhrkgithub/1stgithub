package com.icici.loans.carloans;

public class Child extends Parent
{
public void workhard()
{
	System.out.println("wakeup early, go to college");
}
public void love()
{
	System.out.println("i am in luv");
}
public static void main(String[] args)

{
	Parent p=new Parent();
	p.workhard();
	p.care();
	
Child c=new Child();
c.workhard();
c.love();
c.care();

Parent obj=new Child();
obj.workhard();
obj.care();
}
}