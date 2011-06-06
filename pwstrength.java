/*
* Program asks user for password, assumes password is random and all symbols were produced independently.
*The program then calculates the entropy of the password based on number of possible characters and length
*of the password.
*/

import java.util.*;

public class pwstrength {

        private final static double CHARSET_SIZE = 62;

        public static void main( String[] args ){ // NOPMD by sp0rus on 6/5/11 10:23 PM
        	double entropy = 0;
        	int pwlength = 0;
        	String password;

        	if( args.length > 0 ){
        		password = args[0];
        		pwlength = password.length();
                entropy = pwentropy(pwlength);
        	}
            else{
            	Scanner scan = new Scanner( System.in );
            	System.out.print( "Enter a password (numbers and characters, not case sensitive): ");

            	password = scan.next();
            	pwlength = password.length();
            	entropy = pwentropy(pwlength);
            }
        	System.out.println( "The password entered has " + (int)entropy + " bits of entropy." );
        }

        //does base-2 logarithm
        public static double log2(double number) { // NOPMD by sp0rus on 6/5/11 10:25 PM
        	return Math.log(number)/Math.log(2.0);
        }
        private static double pwentropy(int length){
	        return length*(log2(CHARSET_SIZE));
        }
}
