package com.stu.pkg;
import java.util.Scanner;

public class userinput 
{
	public static void main(String args[]) 
	{
      // create an scanner object
		Scanner input=new Scanner(System.in);
		
		// output prompt
		System.out.println("enter an name:= ");
		
		// wait  for the user to do something
		double dun= input.nextDouble();
		
		// display what they entered
		System.out.println("you have entered: "+ dun);
	}

}
