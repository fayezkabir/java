package com.stu.org;

import java.util.Scanner;

public class AddUsingUser {

	public static void main(String[] args) 
	{
		Scanner input1=new Scanner(System.in);
		System.out.println("sir could you give me your precious  first input");
		double first=input1.nextDouble();
		//double first =5.0;
		
		Scanner input2=new Scanner(System.in);
		System.out.println("sir could you give me your precious input");
		double second=input2.nextDouble();
		System.out.println("sir could you give me your precious  second input");
		//double second=6;

		
		double sum=(((first+second)*10)/2);
		System.out.println("the output is the :--  "+sum);
		
		
	}
}
