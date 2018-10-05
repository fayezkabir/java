package com.stu.org;

import java.util.Scanner;

public class EvenOPeration2 {


	public static void main(String[] args) 
	{
		Scanner text=new Scanner(System.in);
		System.out.println("please enter the  sarting number");
		int number=text.nextInt();

		Scanner texts=new Scanner(System.in);
		System.out.println("please enter the  final number");
		int finalNumber=texts.nextInt(); 
		
		/*Scanner text3=new Scanner(System.in);
		System.out.println("please enter the  number");
		int evenNumberfound=text3.nextInt();*/
		/*int number =5;
		int finalNumber=20;*/
		int evenNumberfound=0;
		while(number<=finalNumber) 
		{
			if(!isEvenNumber(number)) 
			{
				number++;
				continue;
				
			}
			
			System.out.println("the even number is "+number);
			number++;
			
			evenNumberfound++;
			if(evenNumberfound>50) {
				
				break;
			}
			
		}
		System.out.println("total even number found :- "+evenNumberfound);
		
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
