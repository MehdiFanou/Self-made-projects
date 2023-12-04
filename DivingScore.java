/**
 * @author: Mehdi Fanou
 *  
 * Problem One, Diving scores from 7 different judges 
 **/

import java.util.Scanner;
public class DivingScore 
{
	public static void main(String[] args)
	{
		final int MAXIMUM_SCORES = 7;
		Scanner console = new Scanner(System.in);
		
		double divingScores[] = new double[MAXIMUM_SCORES];
		double difficulty;		
		
		System.out.print("Please enter the difficulty level (1.2 - 3.8): ");
		difficulty = console.nextDouble();
		
		while(difficulty < 1.2 || difficulty > 3.8)
		{
			System.out.print("Please enter the valid difficulty level: ");
			difficulty = console.nextDouble();
		}
		
		for(int i = 0; i < MAXIMUM_SCORES; i++)
		{
			System.out.print("Enter the score of judge " 
								+ (i + 1) + " (0 - 10): ");
			divingScores[i] = console.nextDouble();
			
			while(divingScores[i] < 1 || divingScores[i] > 10)
			{
				System.out.print("Enter the valid score of judge " 
									+ (i + 1) + ": ");
				divingScores[i] = console.nextDouble();
			}
		}
		
		double minimum = divingScores[0];
		double maximum = divingScores[0];
		double total = 0;
		
		for(int i = 0; i < MAXIMUM_SCORES; i++)
		{
			if(divingScores[i] < minimum)
				minimum = divingScores[i];
			
			if(divingScores[i] > maximum)
				maximum = divingScores[i];
			
			total = total + divingScores[i];
		}
		
		total = total - maximum - minimum;		
		total = total * difficulty;
		total = total * 0.6;
		
		System.out.printf("\nThe overall score for the dive: %.1f\n", total);
	}
}