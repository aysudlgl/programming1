import java.util.Scanner;

public class ArrayMethods {
	public static void main(String[] args) {
		int ix;
		int array[]= { 13, 23, -78, 45, 91, -23, 18, 56, 90, 100, 12, 14, 67, 21, -98, 65, 3, 56, -97, 45, 143, 14, 1 };
		int maximum = ArrayMethods.getMax(array);

		int mindex=ArrayMethods.findMin(array);
		int total=ArrayMethods.sum(array);
		double average = ArrayMethods.mean( array);
		int value=45;
		int count = ArrayMethods.largerThan( array, value );
		System.out.println("Maximum is "+maximum);
		System.out.println("Minimum is "+array[mindex]);
		System.out.println("Sum is "+total);
		System.out.println("Average is "+average);
		System.out.println("Number of values larger than "+value+" is "+count);
		int positive[]=ArrayMethods.getPositive(array);
		for(ix=0;ix<positive.length;ix++)
		{
		System.out.printf("%4d",positive[ix]);
		}
		System.out.println();
		int square[][]={{8, 11, 14, 1},{13,2,7,12},{3,16,9,6},{10,5,4,15}};
		int mainD=ArrayMethods.sumMainDiag(square);

		System.out.printf("Main diagonal sum = %d\n",mainD);

		}
	public static int sum(int[] array) {
		int total = 0;
		int ix;
		for ( ix=0; ix < array.length; ++ix)
				total += array[ix];
		return total;
			
		}

		public static int getMax(int[] array) {
			
			int maxVal = array[0];
			int ix;
			for ( ix = 1; ix < array.length; ix++) {
				if ( array[ix] > maxVal) maxVal = array[ix];
			}
			
			
			
			return maxVal;
		}

	// add the findMin method here
		public static int findMin( int[] array ) {
			int mindex = 0;
			int ix;
			
			for ( ix=1; ix < array.length; ++ix)
			{
				if ( array[ix] < array[mindex]) mindex = ix;
			}
			
			return mindex;
		}
		

	// add the arithmetic mean here

		public static double mean( int[] array ) {
			return sum( array)/(double) array.length;
		}



		public static int largerThan(int[] array, int value) {
			int count = 0;
			int ix;
			
			for ( ix=0; ix < arsray.length; ++ix)
			{ 
				if ( value < array[ix]) ++count;
			}
			return count;
		}

		public static int[] getPositive(int[] array) {
			int count = largerThan( array,0);
			int [] tmp = new int [ count ];
			int ix;
			count = 0;
			for ( ix = 0; ix<array.length; ++ix)
			{ 
				if ( array[ix] > 0) tmp[count++] = array [ix];
			}
			
			return tmp;
		}
	 
		public static int sumMainDiag(int[][] square) {
		
				int mDiag = 0;
				int ix;
				for ( ix=0; ix < square.length; ++ix ) mDiag += square[ix][ix];
			return mDiag;
		}
		
		public static int sumColumnI( int [][] square, int icol ) {
			int colSum = 0;
			int ix;
			for ( ix=0; ix < square.length; ++ix)
			{
				colSum += square[ix][icol];
			}
			return colSum;
		}
		
	}

