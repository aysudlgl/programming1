import java.util.Scanner;

public class DicePair {
	public static void main(String[] args) {

		Scanner scnr = new Scanner( System.in );
	
		int SIDES = scnr.nextInt();
		int ir, ic;
		
		for ( ir = 1; ir <= SIDES ; ir++)
		{
			for ( ic = 1; ic <= SIDES ; ic++) {
				System.out.printf("(%d, %d) " , ir ,ic );
			
			}
			System.out.println();
		}
		scnr.close();
	}
}
