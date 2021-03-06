import java.util.Scanner;
/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 9/16/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */
/**
   This program demonstrates how numeric types and operators behave in Java
   Do Task #1 before adding Task#2 where indicated.
 */
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		Scanner input = new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2 ; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		double temp;
		//Task #2 prompt user to input score1
		System.out.print("Enter the value for score 1:");
		//Task #2 read score1 
		score1 = input.nextInt();
		//Task #2 prompt user to input score2
		System.out.print("Enter the value for score 2:");
		//Task #2 read score2 
		score2 = input.nextInt();
		// Find an arithmetic average
		average = (double)(score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		System.out.println("Enter the value for Fahrenheit:");
		//Task #2 read the user’s temperature in Fahrenheit
		temp =  input.nextDouble();
		// Convert Fahrenheit temperatures to Celsius
		fToC = 5.0/9 * (temp - 32);
		output = temp + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
