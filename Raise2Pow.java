import java.util.Scanner;

public class Raise2Pow {
	public static void main( String [] args ) {
		
		Scanner scnr = new Scanner( System.in );
		
		int expon = scnr.nextInt();
		
		System.out.print( power2( expon ) );
		
		scnr.close();
	}
	
	// TODO: Add logic to compute the base to the exponent stored in expon using recursion.
	// If expon = 5, return 32.
	public static int power2( int expon ) {
	   if (expon>0)
		   return 2 * power2( expon-1 );
	   else
		return 1;

			
			
		
	}
}