package com.stu.pkg;
import java.util.Scanner;

public class Switch_calculator {
	public static void main(String args[]) 
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("please the the month you want to see: ");
		
		String month=input.nextLine();
		
		switch (month) 
		{
		case "1" :
		{
			System.out.println("this is the january month ");
		}
		case "2" :
		{
			System.out.println("this is the february month ");
			break;
		}
		case "3" :
		{
			System.out.println("this is the march month ");
			break;
		}
		case "4" :
		{
			System.out.println("this is the april month ");
			break;
		}
		case "5" :
		{
			System.out.println("this is the may month ");
			break;
		}
		case "6" :
		{
			System.out.println("this is the june month ");
			break;
		}
		case "7" :
		{
			System.out.println("this is the july month ");
			break;
		}
		case "8" :
		{
			System.out.println("this is the august month ");
			break;
		}
		case "9" :
		{
			System.out.println("this is the september month ");
			break;
		}
		case "10" :
		{
			System.out.println("this is the october month ");
		}
		/*case "1" :
		{
			System.out.println("this is the january month ");
		}*/
		}
		
		

	}
}
