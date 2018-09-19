package com.stu.pkg;

public class calculatorSwitch 
{
public static void main(String args[]) 
	{
	 int a=20;
	 int b=10;
	 int z=4;
	 switch(z)
	 {
	 case 1 :
	 		{
	 		 z=a+b;
	 		 System.out.println("z="+z);
	 		 break ;
	 		}
	 case 2 :
		{
		 z=a-b;
		 System.out.println("z="+z);
		 break ;
		 }
	 case 3 :
		{
		 z=a*b;
		 System.out.println("z="+z);
		 break ;
		}
	 case 4 :
		{
		 z=a/b;
		 System.out.println("z="+z);
		 break ;
		}
		default :
		{
			System.out.println("this is not the number");
		}
	}
  }
}

