import java.util.Scanner;

public class homework {
	public static void main( String [] args ) {
		// find the column in the data array with the maximum sum.
		Scanner scnr = new Scanner (System.in);
		//The example below computes the average of an input list of integer values. 
		//The first input indicates the number of values in the subsequent list. That number controls how many times the subsequent for loop iterates.
		int currValues ;
		int sumValues ;
		int numofValues; 
		int i ;
		numofValues = scnr.nextInt();
		sumValues = 0;
		for ( i = 0; i < numofValues; ++i) {
			currValues = scnr.nextInt();
			currValues =+ sumValues;
		
		}
		System.out.println("Average is" + (sumValues/numofValues));
	}
}
