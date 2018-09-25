package com.stu.pkg;
import java.util.Scanner;

public class Switch_userinput {
	public static void main(String args[]) 
	{
		Scanner text=new Scanner(System.in);
		System.out.println("please enter any input: ");
		String name=text.nextLine();
		
		switch(name) 
		{
		case "start" :
		{
			System.out.println("machine has strated");
			break ;
		}
		case "update" :
		{
			System.out.println("machine is repairing");
			break;
		}
		case "stop" :
		{
			System.out.println("machine got stopped working");
			break;
		}
		default:
		{
			System.out.println("machine is shut down");
		}
		
		}
	}
}
