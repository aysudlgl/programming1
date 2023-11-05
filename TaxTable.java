import java.util.Scanner;

public class TaxTable {
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner( System.in );
		System.out.println("Enter the marriage status (S|s for single, M|m for married), and the income: ");
		
		String status = console.next().substring(0,1);
		double income = console.nextDouble();
		
		double tax = 0.0;
		
		if ( status.equalsIgnoreCase("S"))
		{
			if ( income <= 0 )
				tax = 0.0;
			else if ( income <= 21450.0 )
				tax = .15*income;
			else if ( income <= 51900.0 )
				tax = 3217.5 +.28*(income - 21450.0);
			else
				tax = 11743.5 +.31*(income - 51900.0);
			System.out.printf("Tax is : $%,.2f \n",  tax);
		}
		else if ( status.equalsIgnoreCase("M")) {// must be married
			if ( income <=0)
				tax = 0.0;
			else if ( income <= 35800.0)
				tax = .15*income;
			else if ( income <= 86500.0)
				tax = 5370. + .28*(income - 35800.0);
			else
				tax = 19566. + .31*(income - 86500.0);
			
			System.out.printf("Tax is : $%,.2f \n",  tax );
		} else {
			System.out.println( status + ": Unknown status.");
			
		}
		
	} 
}


