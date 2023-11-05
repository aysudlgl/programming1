import java.util.Scanner;

public class MagicSquare {
	public static boolean isItSquare(int[][] array2D )
{
		int len = array2D.length;
		
		for ( int i = 0; i < len; i++) {
			if ( array2D[i].length != len)
				return false;
		}
		return true;
}
	
	public static boolean hasNumber(int[][] array2d, int n) {
		for ( int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if(array2d[i][j] == n)
					return true;
			}
		}
		return false;
	}
	public static int sumRowI(int[][] array2D, int row) {
		
		int sum = 0;
		
		for ( int j = 0; j < array2D[row].length; j++)
			
			sum = sum + array2D[row][j];
		
		return sum;
	}
	 public static int sumColumnJ(int[][] array2D, int col) {
		 int sum = 0;
		 
		 for ( int j = 0; j < array2D.length; j++)
			 
			 sum = sum + array2D[j][col];
		 
	 return sum;

	 }
	 
	 public static int sumDiagonal (int[][] array2D, boolean diagonal) {
		 int sum = 0;
		 if ( diagonal) {
			 for(int i = 0; i < array2D.length; i++) {
				 for (int j = 0; j < array2D[i].length; j++) {
					 if (i == j)
						 sum = sum + array2D[i][j];
				 }
				
			 }
		 }
		 
		 else {
			 for(int i = 0; i < array2D.length; i++) {
				 for (int j = 0; j < array2D[i].length; j++) {
					 if ((i+j) == (array2D[i].length - 1))
						 sum = sum + array2D[i][j];
					 
				 }
			 }
				 
		 }
		 return sum;
	 }
		 public static void main(String[] args) 
			{
				int ir, ic;
				int [][][] array3D = { 
						{  
							{ 4, 5, 6 }, 
							{ 1, 2, 3, 4 }, 
							{ 9, 7 } 
						}, 
						{  
							{ 5, 5, 5 }, 
							{ 5, 5, 5 }, 
							{ 5, 5, 5 }  
						}, 
						{	{ 1, 3, 1 }, 
							{ 2, 2, 2 }, 
							{ 3, 1, 3 } 
						},
						{	{ 3, 2, 1 }, 
							{ 1, 2, 3 }, 
							{ 3, 2, 1 } 
						},
						{
							{ 9, 8, 7 }, 
							{ 1, 2, 3 }, 
							{ 4, 6, 5 } 
						},
						{	{ 2, 9, 4 }, 
							{ 7, 5, 3 }, 
							{ 6, 1, 8 } 
						},
						{
							{ 9, 6, 3, 16 },
							{ 4, 15, 10, 5 },
							{ 14, 1, 8, 11 },
							{ 7, 12, 13, 2 },
						}
				                  };  // end array of tables.


				boolean skip;
				for ( int i = 0; i < array3D.length ; i++ ) {
					skip = false;
					int [][] array2D = array3D[i];
					if ( ! MagicSquare.isItSquare( array2D ) ) {
						System.out.printf( 
						"Square %d Failed: Array is not square.\n", i);
						continue; // go to next test square
					}
					
					int testSum = MagicSquare.sumDiagonal( array2D, true );
					if ( testSum != MagicSquare.sumDiagonal( array2D, false) ) {
						System.out.printf( 
						"Square %d Failed: Diagonals don't match.\n", i);
						continue; // go to next test square
					}
			
					for ( ir = 0; ir < array2D.length ; ir++ ) {
						if ( testSum != MagicSquare.sumRowI(array2D, ir) ) {
							System.out.printf( 
							"Square %d Failed: Rows don't match.\n", i);
					        skip = true;
					        break; // jump out of this loop
						}
					}
					if ( skip ) continue; // go to next test square;
					for ( ic = 0; ic < array2D.length ; ic++ ) {
						if ( testSum != MagicSquare.sumColumnJ(array2D, ic) ) {
							System.out.printf(
							 "Square %d Failed: Columns don't match.\n", i);
							skip = true;
							break;
						}
					}
					if ( skip ) continue;
					for ( ir = 0; ir < array2D.length*array2D.length; ir++ ) {
						if ( ! MagicSquare.hasNumber( array2D, ir+1 ) ) {
							System.out.printf( 
				"Square %d Failed: does not contain numbers from 1 to n.\n", i );
							skip = true;
							break;
						}
					}
					if ( skip ) continue;
					
					System.out.printf( "Square %d IS a magic square!\n", i);
				} // end for loop
			   // end main
		
	 }
}