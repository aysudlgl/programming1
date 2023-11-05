import java.util.Scanner;

public class Seasons {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String month;
		int day;

		 month = console.next();
		 day = console.nextInt();
		 
		 if ((month.equals("March") && day >= 20 && day <= 31) || (month.equals("April") && day >= 1 && day <= 30)
	                || (month.equals("May") && day >= 1 && day <= 31) || (month.equals("June") && day >= 1 && day <= 20))
	            System.out.println("spring");

	        //checking the given date belongs to summer season
	        else if ((month.equals("June") && day >= 21 && day <= 30) || (month.equals("July") && day >= 1 && day <= 31)
	                || (month.equals("August") && day >= 1 && day <= 31) || (month.equals("September") && day >= 1 && day <= 21))
	            System.out.println("summer");

	        //checking the given date belongs to Autumn season
	        else if ((month.equals("September") && day >= 22 && day <= 30) || (month.equals("October") && day >= 1 && day <= 31)
	                || (month.equals("November") && day >= 1 && day <= 30) || (month.equals("December") && day >= 1 && day <= 20))
	            System.out.println("autumn");

	        //checking the given date belongs to Winter season
	        else if ((month.equals("December") && day >= 21 && day <= 31) || (month.equals("January") && day >= 1 && day <= 31)
	                || (month.equals("February") && day >= 1 && day <= 28) || (month.equals("March") && day >= 1 && day <= 19))
	            System.out.println("winter");

	        //In all other cases print invalid
	        else
	            System.out.println("Invalid input");
	    }
	}