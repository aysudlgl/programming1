import java.util.Scanner;

public class Lab2ExactChange {
public static void main (String[] args)
{
	 Scanner console = new Scanner ( System.in );
	   
	   System.out.println("Enter the amount in cents:");
	   int amount = console.nextInt() ;
	   System.out.println("The change for " + amount + " cents is: ");
	
	   int oneDollarBills = amount / 100;
	   System.out.println("Dollars = " + oneDollarBills);
	   amount = amount % 100;
	   
	   
	   int halfdollars = amount / 50;
	   System.out.println("Half-Dollars = " + halfdollars);
	   amount = amount % 50;
//	   
	   int quarters = amount /25;
	   System.out.println("Quarters = " + quarters);
	   amount = amount % 25;
////	  
//	   
	   int dimes = amount / 10;
	   System.out.println("Dimes = " + dimes);
	   amount = amount % 10;
////	  
	   int nickels = amount / 5;
	   System.out.println("Nickels = " + nickels);
	   amount = amount % 5;
////	  
	   int  pennies = amount / 1;
	   System.out.println("Pennies = " + pennies);
	   amount = amount % 1;
	  
	  
//	System.out.println(fiveDollarBills);
//	System.out.println(amount);
	
}
}


