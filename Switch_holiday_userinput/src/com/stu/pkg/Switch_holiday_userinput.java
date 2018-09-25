package com.stu.pkg;
import java.util.Scanner;

public class Switch_holiday_userinput {
	public static void main(String args[]) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("give me the input");
		int holi=input.nextInt();
		switch (holi) 
		{
		case 1 :
		{
			
		}
		case 2:{
			
		}
		
		
		case 5 :
		{
			System.out.println("working day");
			break;
		}
		default :
		{
			System.out.println("holi day");
			break;
		}
		}
	}
	
}
