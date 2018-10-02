package com.stu.pkg;

 class Rendy {
	int a = 6;
	int b = 5;
	int sum = 0;
public void add() {
		sum = a + b;
		System.out.println("the rewsult:=" + sum);
	}
}

public class pritha {
	public static void main(String args[])

	{
		
		Rendy obj=new Rendy();
		
		obj.add();
	}
}
