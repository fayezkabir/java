package com.stu.pkg;

public class calswitchupdated {
	public static void main(String args[]) 
	{
	 int a=20;
	 int b=5;
	 int z=4;
	 switch(z)
	 {
	 case 1 :
	 		{
	 		 System.out.println("ADD="+(a+b));
	 		 break ;
	 		}
	 case 2 :
		{
		 System.out.println("SUB="+(a-b));
		 break ;
		 }
	 case 3 :
		{
		 System.out.println("MULT="+(a*b));
		 break ;
		}
	 case 4 :
		{
		 System.out.println("DIV="+(a/b));
		 break ;
		}
		default :
		{
			System.out.println("this is not the number");
		}
	}
  }

}
