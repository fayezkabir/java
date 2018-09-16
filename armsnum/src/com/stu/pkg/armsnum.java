package com.stu.pkg;

public class armsnum {

public static void main(String args[]) 
{int num=153;
	int a=num,sum=0;
	int temp=0;
	
	while (a>0)
	{
		temp=a%10;
		a/=10;
		sum+=(temp*temp*temp);
	}
//	if(sum==num) {
	System.out.println("the result is " + (sum == num) );
//	}
//	else 
//	{
//		System.out.println("the result is false");
//	}
	
}
}
