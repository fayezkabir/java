package com.stu.pkg;

public class Boolean 
{public static void main(String args[]) 
	{
	  boolean gameOver=true;
	  int score=100;
	  int levelComplete=10;
	  int bonus=5;
	  if(gameOver==true) 
	  {
		  int finalScore=score*(levelComplete*bonus);
		  System.out.println("congratulation you have completedthe runs :- "+finalScore);
	  }
	  
	   gameOver=true;
	   score=500;
	   levelComplete=8;
	   bonus=6;
	  if(gameOver==true) 
	  {
		  int finalScore=score*(levelComplete*bonus);
		  finalScore+=1000;
		  
		  System.out.println("congratulation you have completedthe runs :- "+finalScore);
	  }
	  
	  
	  
	}
  
}
