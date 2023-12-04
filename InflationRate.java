/**
 * @author: Mehdi Fanou
 * 
 * A program that calculates the inflation price with the total cost of anything
 **/
import java.util.Scanner;

public class InflationRate {

	public static void main(String[] args) {
		double cost, inflation;
		int years;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the cost :");
		cost = input.nextDouble();
		System.out.print("Enter the number of years:");
		years = input.nextInt();
		System.out.print("Enter the inflation rate:");
		inflation = input.nextDouble() * .01;
		for (int i = 0; i < years; i++)
			cost += cost * inflation;
		cost = (int) (cost * 100) / 100.0;
		System.out.println("Item will cost about $ " + cost + " in " + years + " years. " );
	}
}