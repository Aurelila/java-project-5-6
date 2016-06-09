// Nancy McCoy  2242343

package mccoy5_6;

import java.util.Scanner;

public class Chap6_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Prompts the user to enter two numbers.
		System.out.print("Enter two double numbers.");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		totaldiff(number1,number2);
		product(number1,number2);
		quotient(number1,number2);
		
		
		
	}

	// Method for the total and positive difference
	public static void totaldiff(double number1, double number2) {
		double positiveDiff = 0;		
		double totalNum = number1 + number2;
		
		
		if (number1 > number2) {
			 positiveDiff = number1 - number2;
		} else if (number2 > number1) {
			 positiveDiff = number2 - number1;
			
			System.out.println("The total between" +" " + number1 + "and" + " " + number2 + "is" + " " + totalNum);
			System.out.println("The positive difference between" + " " +number1 + "and" +" " + number2 + "is" + " " + positiveDiff);
		}
	}

	public static void product(double number1,double number2) {
		double product = 0;
		
		 product = number1 * number2;
		
		System.out.println(number1 + " " +"times" +" " + number2 + " " + "equals" + " " + product);
	}

	public static void quotient(double number1, double number2) {
			double quotient =  number1/number2;			
			System.out.print(number1 + " " + "divided by" + " " + number2 + " " + "equals" + " " + quotient);	
		
		}
		
		}
		
	

