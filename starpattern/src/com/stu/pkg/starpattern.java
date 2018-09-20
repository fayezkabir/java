package com.stu.pkg;

public class starpattern 
{
	public static void main(String args[]) 
	{int z=5;
	int n=5;
		for(int i=0;i<=n;i++) 
		{
			for(int j=0;j<i;j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=z;k++) 
			{
				System.out.print("*");
			}
			z--;
			System.out.println();
		}
	}

}
