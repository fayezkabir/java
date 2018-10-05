package com.stu.pkg;
import java.util.Scanner;

public class ContinueKeyWord {


	public static void main(String[] args) 
	{
		/*Scanner text=new Scanner(System.in);
		System.out.println("please enter the  number");
		int number=text.nextInt();

		Scanner texts=new Scanner(System.in);
		System.out.println("please enter the  final number");
		int finalNumber=texts.nextInt();*/
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
