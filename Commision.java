import java.util.Scanner;

public class Commision {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		final double base_salary=2500.00;
		double commission=0;
		
		
		double Current_sales=console.nextDouble();
		double previousmonth_returns=console.nextDouble();
		double netsales=(Current_sales-previousmonth_returns);
		
		if(netsales<=0)
		{
		netsales=0;
		double monthlysalary=base_salary;
		System.out.printf("Total monthly pay = $%,.2f based on net sales of $%,.2f",monthlysalary,netsales);
		}
		else if(netsales<1000){
		commission=netsales*0.01;
		double monthlysalary=base_salary+commission;
		System.out.printf("Total monthly pay = $%,.2f based on net sales of $%,.2f",monthlysalary,netsales);
		}
		else
		{
		commission=(netsales-1000)*0.03 +10 ; //10 = 1% of first 1000
		double monthlysalary=base_salary+commission;
		
		
		System.out.printf("Total monthly pay = $%,.2f based on net sales of $%,.2f",monthlysalary,netsales);
		}
	}
}
	
