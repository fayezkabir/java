package com.stu.pkg;

public class Methodoperation {

	public static void main(String[] args) 
	{ /*
	    boolean decition=true;
		int score=1000;
		int bonus=5;
		int leve=10;  */
		
		//can use these variables n the fayez() argument  like fayez(boolean,int ,int,int)

		
		fayez( true,1000,5,10);
		
		 /*decition=true;
		 score=1000;
		 bonus=5;
		 leve=10; */
		
		//can use these variables n the fayez() argument  like fayez(boolean,int ,int,int)
		fayez(true,3000,6,10);
	

	}
	public static void fayez(boolean decition,int score,int bonus,int level) 
	{
		
		
		if (decition == true)
		{
			int finalScore=score+(bonus*level);
			finalScore+=2000;
			System.out.println("your score is :- "+finalScore);
		}
		
	}

}
