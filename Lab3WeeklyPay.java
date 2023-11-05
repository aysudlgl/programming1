import java.util.Scanner;

public class Lab3WeeklyPay {
public static void main(String [] args)
{
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Enter the wage and hours worked per week:");
	
	double hourlyWage;
	  hourlyWage = scnr.nextDouble();
    double weeklyHours;
      weeklyHours = scnr.nextDouble();
    double weeklySalary;
    double overtimeHours;
    final double WEEKLY_LIMIT =40 ;
 
   
   if (weeklyHours <= WEEKLY_LIMIT ) {
	   weeklySalary = weeklyHours * hourlyWage;
	    }
   else { 
	   overtimeHours = weeklyHours - WEEKLY_LIMIT;
	   weeklySalary =((hourlyWage * WEEKLY_LIMIT) +
			  (hourlyWage * overtimeHours * 1.5));
   }		
	System.out.printf( "Worker pay is $%.2f\n", weeklySalary );
	  
   
}
}


