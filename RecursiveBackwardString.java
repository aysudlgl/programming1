import java.util.Scanner;

public class RecursiveBackwardString {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner( System.in );
		
		String myStr = scnr.nextLine();
		
		// Write string backward using iteration:
		backwardI( myStr );
		
		System.out.println();
		// Write string backward using a tail recursion:
		backwardTailR( myStr );
		
		System.out.println();
		// Write string backward using a forward recursion:
		backwardForwardR( myStr );
		
		scnr.close();
	}

	public static void backwardI( String inStr ) {
		int idx;
		String outStr = "";
		for ( idx = inStr.length()-1; idx >= 0 ; --idx ){
			outStr += inStr.charAt( idx );
		}
		System.out.print( outStr );
	}
	
	public static void backwardTailR( String inStr ) {
		int strLen = inStr.length();
		if ( strLen > 0 ) {
			System.out.print( inStr.charAt( strLen-1 ) );
			backwardTailR( inStr.substring(0, strLen-1) );
		}
		
	}
	
	public static void backwardForwardR( String inStr ) {
		int strLen = inStr.length();
		if ( strLen > 0 ) {
			backwardForwardR( inStr.substring(1,strLen) );
			System.out.print( inStr.charAt(0) );
		}
	}
}
