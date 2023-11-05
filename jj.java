import java.util.Scanner;

public class jj {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	Scanner kb = new Scanner(System.in);

	double loan;
	loan = kb.nextDouble();

	
	System.out.printf("Table of monthly payment for a dollar loan amount of $%,.2f\n\n",loan);


	System.out.printf("%-15s","Years:");
	for(int y=15;y<=30;y+=5)
	System.out.printf("%12s"," "+y+" ");
	System.out.println();
	// display the separator
	for(int i=0;i<65;i++)
	System.out.print("_");
	System.out.println();

	// loop over the annual interest rate from 4 to 7 in steps of 0.5
	for(double r=4;r<=7;r+=0.5) {
	// display the annual interest rate
	System.out.printf("%-4.1f%%%10s",r,"");

	// loop for years from 15 to 30 in steps of 5
	for(int y=15;y<=30;y+=5) {
	// convert the annual interest rate to monthly interest rate
	// compute tmp
	double tmp = Math.pow((1+r/1200), 12*y);
	// compute monthly payment
	double payment = (loan*(r/1200)*tmp)/(tmp-1);

	System.out.printf("%,12.2f",payment); // display monthly payment
	}
	System.out.println(); // display a new line at the end
	}
	}
	}

