package com.stu.pkg;

import java.util.Scanner;

public class Rafwork
{
	public static void main(String[] args) 
	{
		/*Scanner text=new Scanner(System.in);
		System.out.println("please enter the  number");
		int number=text.nextInt();*/
		int number =5;
		int finalNumber=20;
		while(number<=finalNumber) 
		{
			if(!isEvenNumber(number)) 
			{
				number++;
				continue;
				
			}
			System.out.println("the even number is"+number);
			number++;
		}
		
	}
	public static boolean  isEvenNumber(int number) 
	{
		if((number%2)==0) 
		{
		 return true;
			
		}
		else 
		{
			return false;
			}
		}
}