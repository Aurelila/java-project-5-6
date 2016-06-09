// Nancy McCoy  2242343

package mccoy5_6;

public class Chap6_03 {

	// The main method for printing
	public static void main(String[] args) {
		//Calls the first method.
		System.out.println("The max between 0 and 9 is " + total(0,9));

		//Calls the second method.
		System.out.println("The max between 4, 5 and 6 is " + total(4,5,6));
		
		//Calls the third method.
		System.out.println("The max betwen 1 and 8.5 is " + total(1,8.5));
	}

	//First method
	public static int total(int num1, int num2) {
		if (num1 > num2) 
			return num1;
		else
			return num2;
	}

	//Second method
	public static int total(int num1, int num2, int num3) {
	

	if (num1 > num2 && num1 > num3 ) {
		return num1;
	}
	else if (num2>num1 && num2>num3)
		return num2;
	else 
		return num3;
	}

	//Third method
	public static double total(int num1, double num2) {
	if (num1 > num2) 
		return num1;
	else
		return num2;
	}
}

