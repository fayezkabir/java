package com.stu.pkg;

public class demooverld {

	public void add (int a,int b) 
	{
		int sum= a+b;
		System.out.println("the sum is="+sum);
	}
	public void add (int a ,int b, int c) 
	{
	int sum=a+b+c;
	System.out.println("th sum is ="+sum);
	}
	public void add(int a,double b) 
	{
	 double sum= a+b;
	 System.out.println("the sum is ="+sum);
	 
	}
	public static void main(String args[]) 
	{
	 demooverld obj=new demooverld();
	 obj.add(2,3,4);
	 obj.add(6,5.2);
	 obj.add(3,1);
	}
	}


