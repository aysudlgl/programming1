import java.util.Scanner;

public class Interstate {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int highwayNumber;
		int auxiliaryNumber;
//		int primaryNumber;
		int primary = 0;

		highwayNumber = console.nextInt();
		// primary highways
		if (highwayNumber > 1 && highwayNumber <= 99) {

			if (highwayNumber % 2 == 0) {
				System.out.println("The " + highwayNumber + " is primary, going east/west.");
			} else {
				System.out.println("The " + highwayNumber + " is primary, going north/south.");
			}
		}
		// Auxilary
		else if (highwayNumber > 99 && highwayNumber <= 999) {
			primary = highwayNumber % 100;

			if (highwayNumber % 2 == 0) {
				System.out.printf("The %d is auxiliary, serving the %d, going east/west.", highwayNumber, primary);
			}
//		}
			else 
			{
			System.out.printf("The %d is auxiliary, serving the %d, going north/south.", highwayNumber, primary);
			}
		}
		else
		
		{
			System.out.printf(highwayNumber + " is not a valid interstate highway number.");
		}
	}
}