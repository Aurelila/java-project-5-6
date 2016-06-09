// Nancy McCoy  2242343

package mccoy5_6;

public class Chap5_03 {

	public static void main(String[] args) {
		//Prints the titles.
		System.out.println("N     Sq Root     Cube Root");
		
		//Prints the formula.
		for (int i = 0; i < 101; i+=5) {
		System.out.printf("%03d  %07.4f %03d  %07.4f%n",i, Math.sqrt(i), i, Math.cbrt(i));
		}

		}


		}


