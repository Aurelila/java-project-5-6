// Nancy McCoy  2242343


package mccoy5_6;

import java.util.Scanner;

public class Chap5_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		int number = 0;
		int count = 0;
		int sumNum = 0;
		double average = 0;
		
		//Prompts the user to input a number
		do {
		System.out.print("Enter a number or 0 to quit.");
		number = input.nextInt();
		
		if (number !=0) {
			sumNum += number;
			count++;
		}
		}
		//Prints the response
		while (number !=0); {
			System.out.println("The total of those" + count + "numbers are" + sumNum);
			if (count !=0) { 
			 average = 1.0 * sumNum / count;
				System.out.printf("The average is %.3f.", average);
			}
		}
		}
		
	}

