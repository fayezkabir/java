package com.stu.pkg;

public class metdovrloadingFeetINchis {
	public static void main(String[] args)
	{
		double centimeters=calcFeetAndInchtotheCentimeter(6,0);
		if (centimeters <0.0)
		{
			System.out.println("invalid parameters");
		}
		calcFeetAndInchtotheCentimeter(100);
	}
	
	
	public static double calcFeetAndInchtotheCentimeter(double feet,double inches) 
	{
	if((feet<0)  || (inches<0) || (inches>12)) 
	{
		System.out.println("you typed invalid parameters");
	return-1;
	}//this block is for validation the rules
	
	
	double centimeters = (feet * 12) * 2.54;
	centimeters+= inches *2.54 ;
	System.out.println(feet+" feet , " +inches+" inches :--" + centimeters+" cm ");
	return centimeters;
	
	
	}
	
	
	
	
	public static double calcFeetAndInchtotheCentimeter(double inches) 
	{
		if(inches<0) 
		{
			System.out.println(" invalid typing");
			return -1;
			
		}
		double feet =(int) inches/12;
		double remainingInches=(int) inches % 12;
		System.out.println(inches +"inches is equal to "+ feet+"feet and"+remainingInches+"inches");
		
		return calcFeetAndInchtotheCentimeter(feet,remainingInches);
		
		
	}
	
}
