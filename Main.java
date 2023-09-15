package Main;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = s.nextLine();
		System.out.println("Hey " + name + ", what did you get on the test?");
		double yourScore = s.nextDouble(); //prevents the variable (yourScore) from being changed. 
		
		System.out.println("Really? You got a " + yourScore + ".");
		int averageScore = 88; //Uses double bc the numeric value is a decimal
		System.out.println("The average score is " + averageScore + ".");
		System.out.println("Did you do the extra credit assignemnt?");
		String extraCredit = s.nextLine();
		
		double averageScoreUpdated = (averageScore + yourScore) / 2;
		
		if (extraCredit .equals("yes") ) {
			yourScore += 5;
		}
		
		System.out.println("Did you do above average?");
		
		if (yourScore > averageScoreUpdated) {
			boolean aboveAverage = true;
			System.out.print(aboveAverage);
		} else {
			if (yourScore < averageScoreUpdated) {
			boolean aboveAverage = false;
			System.out.print(aboveAverage);
		} else {
			if (yourScore == averageScoreUpdated) {
				System.out.print("You did average!");
			}
		}
		}
		
		
	}
}
