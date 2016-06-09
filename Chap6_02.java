// Nancy McCoy  2242343

package mccoy5_6;

import java.util.Scanner;

public class Chap6_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompts the user for their name.
		System.out.print("Enter your name");
		String name = input.nextLine();
		System.out.println(name);
		stringer(name);
		
	}

	// Takes the string and reverses it
	private static String stringer(String name) {
		String reverse = new StringBuffer(name).reverse().toString();
		int length = name.length();	
			System.out.println("Reverse of your name is" + reverse);
			System.out.println("You have" + length + "characters in your name");
		
		return reverse;
	}

}
