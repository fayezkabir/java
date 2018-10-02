package com.stu.org;

public class methodoperaionPART2 
{
	

		public static void main(String[] args) 
		{
			
			int highScore=fayez( true,1000,5,10);
			System.out.println("your score is :- "+highScore);
			highScore=fayez(true,3000,6,10);
			System.out.println("your score is :- "+highScore);
		

		}
		public static int fayez(boolean decition,int score,int bonus,int level) 
		{
			
			
			if (decition == true)
			{
				int finalScore=score+(bonus*level);
				finalScore+=2000;
				
				return finalScore;
			}
			return -1;
			
		}

	}



