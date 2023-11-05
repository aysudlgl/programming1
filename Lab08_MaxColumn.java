import java.util.Scanner;

public class Lab08_MaxColumn {
	public static void main( String [] args ) {
		// find the column in the data array with the maximum sum.
		
		int [][] data = {    { 7,  2,   0,   8 }, 
                           { 6,   5,   4,   9,   2 }, 
                           { 1,   2,   3 } };
			
		int ir, ic;
		//use a for loop//
		int maxRowlength = data[0].length;
		
		for(int i=1; i<data.length; i++){
			if (data[i].length > maxRowlength) {maxRowlength = data[i].length;}
				}
				/*
				* FInd the column with the maximum sum.
				*/
				int maxSum = Integer.MIN_VALUE; // smallest possible value
				int colIndexMaxSum = 0;
				int total;
				// Add your code here:
				for (int i = 0; i < maxRowlength; i++) {
				total = 0;
				for (int j = 0; j < data.length; j++) {
				if (data[j].length > i) {
				total += data[j][i];
				}
				}
				if (total > maxSum) {
				maxSum = total;
				colIndexMaxSum = i;
				}
				}

				System.out.printf("Column index %d, has the largest sum = %d.\n", colIndexMaxSum, maxSum);
				}
				}