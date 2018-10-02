package com.stu.pkg;

public class methdOperationPART3 
{
	public static void main(String[] args) {
		int highScorePosition=calculateHighScoreposition(1500);
		displayHighscore("fayez", highScorePosition);
		
		highScorePosition=calculateHighScoreposition(900);
		displayHighscore("kabir", highScorePosition);
		
		highScorePosition=calculateHighScoreposition(400);
		displayHighscore("molla", highScorePosition);
		
		highScorePosition=calculateHighScoreposition(50);
		displayHighscore("king", highScorePosition);
		
		highScorePosition=calculateHighScoreposition(1000);
		displayHighscore("dhoni", highScorePosition);
		
		highScorePosition=calculateHighScoreposition(500);
		displayHighscore("kholi", highScorePosition);
		
		highScorePosition=calculateHighScoreposition(100);
		displayHighscore("rohit", highScorePosition);
	
	
	}
	public static void displayHighscore(String players,int positions) 
	{
		
		System.out.println(players+" manged to get into the position " + positions +" on the top of the table");
		
	}
	public static int calculateHighScoreposition(int playerScore) 
	{
		if(playerScore>=1000) 
		{
		return 1;
		}
		else if(playerScore >=500 && playerScore<1000) 
		{
			return 2;
		}
		else if(playerScore >=100 && playerScore<500) 
		{
			return 3;
		}
		else 
		{
		 return 4;	
		}
	}

}
