// Nancy McCoy  2242343

package mccoy5_6;

public class Chap5_04 {

	public static void main(String[] args) {
		
		//Declares variables.
		char i = 0;
		char j = 0;
		
		//Prints the ASCII characters.
		for(i=33; i < 126+1; i++, j++) {
			if (j%20==0)
			System.out.println();
			System.out.print((char)(i));
			System.out.print(" ");
		}

	}
}
