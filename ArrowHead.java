import java.util.Scanner;

public class ArrowHead {

	public static void main(String[] args) {
		   
		Scanner console = new Scanner( System.in );
		int nRows = console.nextInt();
	
		if ( nRows % 2 == 1 )
		{
			int ir, ic, ib;
			int nStars=1;
			int  nSpaces = nRows - 1;
			
			for ( ir=1; ir <= nRows; ++ir )
			{   for ( ib=1; ib <= nSpaces; ++ib)
				System.out.print(" ");
			
			for ( ic=1; ic <= nStars; ++ic )
				System.out.print('*');
						System.out.println();
						nStars += 2;
						--nSpaces;
						
			}
			}
		}
	
	
}
