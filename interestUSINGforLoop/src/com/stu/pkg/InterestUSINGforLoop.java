package com.stu.pkg;

public class InterestUSINGforLoop {
	public static void main(String[] args) 
{
	for( double interest=2;interest<9;interest++) 
	{
          System.out.println("10000 at "+interest+" % interest ="+fayez(interest,10000));
	}
	
}
public static double fayez(double interest,double  amount) {
	return(amount*(interest/100));
	
}

}
