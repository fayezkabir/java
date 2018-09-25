package com.stu.pkg;
import java.util.Scanner;

public class userinput_dowhile 
{
	public static void main(String args[]) 
	{
		Scanner scanner= new Scanner(System.in);
		int value =0;
		do 
		{
			System.out.println("enter the number: ");
			value=scanner.nextInt();
		}while(value !=5);
		System.out.println("got 5!@#");
	}

}
