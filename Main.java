package odd_even;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main (String [] args)
	{
	// Variables
		Random randomNumber = new Random();
		Scanner input = new Scanner (System.in);
		
		
		int numberOfGames = 0;
		int numberOfSuccess = 0;
		int numberOfLosses = 0;
		 
		int numberOfOdd = 0;
		int numberOfEven = 0;
		int [] matchSummary = new int[5];
		// Array
		
		
		while (true) {
			
		// Roll dice
		int computerGuess = randomNumber.nextInt(6);
		System.out.println("Guess if the number is odd or even. ");
		System.out.println("Enter 1 for Odd; Enter 2 for even; Enter 3 to quit.");
		int playerGuess = input.nextInt();
		
		numberOfGames++;
		
		if (playerGuess < 1 || playerGuess > 3) {
			System.out.println("Invalid input. ");
		}
		else if (playerGuess == 3) {
			break;
		}
		else if (playerGuess == 1) {
			numberOfOdd++;
			if (computerGuess % 2 == 1) {
				System.out.println("You Win!");
				numberOfSuccess++;
				
			}
			else {
				System.out.println("You Lose!");
				numberOfLosses++;
			}
		}
		else if (playerGuess == 2) {
			numberOfEven++;
			if (computerGuess % 2 != 1) {
				System.out.println("You Win!");
				numberOfSuccess++;
				
			}
			else {
				System.out.println("You Lose!");
				numberOfLosses++;
		}
			
			
		}
		matchSummary[0] = numberOfOdd;
		matchSummary[1] = numberOfEven;
		matchSummary[2] = numberOfSuccess;
		matchSummary[3] = numberOfLosses;
		matchSummary[4] = numberOfGames;
		float winPercentage = numberOfSuccess * 100 / numberOfGames;
		System.out.println("You have played " + matchSummary[4] + " games");
		System.out.println("You won a total of " + matchSummary[2]+ " games");
		System.out.println("You have lost a total of " + matchSummary[3]+ " games");
		System.out.println("You have guessed Odd " + matchSummary[0]+ " times");
		System.out.println("You have guessed Even " + matchSummary[1]+ " times");
		System.out.println("Your win percetange is: " +winPercentage);
		}
		}
		
	}

// Please add more comments...also, why do you use while (true) ?
