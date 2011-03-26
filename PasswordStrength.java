/*
* Program asks user for password, assumes password is random and all symbols were produced independently.
*The program then calculates the entropy of the password based on number of possible characters and length
*of the password.
*/

import java.util.*;

public class PasswordStrength {
	public static void main( String[] args ){
		final double POSSIBLECHARS = 62; //Upper and Lower Alphabet (52), Arabic Numerals (10)
		double entropy = 0;
		int pwlength = 0;

		Scanner scan = new Scanner( System.in );
		System.out.print( "Enter a password (numbers and characters, not case sensitive): ");

		String test = scan.next();

		pwlength = test.length();

		entropy = pwlength*(log2(POSSIBLECHARS));

		System.out.println();
		System.out.println( "The password entered has " + (int)entropy + " bits of entropy.");
	}

	//does base-2 logarithm
	public static double log2(double d) {
		return Math.log(d)/Math.log(2.0);
	}
}
