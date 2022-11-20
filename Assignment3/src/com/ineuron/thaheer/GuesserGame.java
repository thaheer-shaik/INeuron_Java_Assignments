package com.ineuron.thaheer;

import java.util.Scanner;


class Guessing
{
	int num;
	
	public Guessing(String person)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(person+" kindly guess the number");
		num = scan.nextInt();
	}
}

class Guesser extends Guessing
{
	
	public Guesser()
	{
		super("Guesser");
	}
}

class Player extends Guessing
{
	
	public Player()
	{
		super("player");
	}
}

class Umpire 
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	void collectNumFromGuesser() 
	{
		Guesser g = new Guesser();
		numFromGuesser = g.num;
		
	}

	void collectNumFromPlayers() 
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 =p1.num;
		numFromPlayer2 =p2.num;
		numFromPlayer3 =p3.num;

	}

	void compare() 
	{
		if (numFromGuesser == numFromPlayer1) 
		{
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) 
			{
				System.out.println("All players won the game");
			} else if (numFromGuesser == numFromPlayer2) 
			{
				System.out.println("Player 1 & Player2 won");
			} else if (numFromGuesser == numFromPlayer3) 
			{
				System.out.println("Player 1 & Player3 won");
			} else 
			{
				System.out.println("Player 1 won the game");
			}
		} 
		else if (numFromGuesser == numFromPlayer2) 
		{
			if (numFromGuesser == numFromPlayer3) 
			{
				System.out.println("Player 2 & Player3 won");
			} else 
			{
				System.out.println("Player 2 won the game");
			}
		} 
		else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game");
		}
		else 
		{
			System.out.println("Game lost Try Again!");
		}

	}

}

public class GuesserGame {

	public static void main(String[] args) {
		
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();

	}

}
