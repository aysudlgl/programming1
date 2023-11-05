import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class FormatTable {
	
	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		int amt=scnr.nextInt();						
		Locale locale = new Locale("en", "US");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);	

		System.out.print("Table of monthly payments for a dollar loan amount of ");
		System.out.println(currencyFormatter.format(amt));						
		System.out.println();
		System.out.printf("%s%12d%15d%15d%15d\n","Years:",15,20,25,30);
		for(int i=0;i<65;i++)
			System.out.print("_");
			System.out.println();
			
		for(double arp=4.0;arp<=7;arp=arp+0.5)					
		{
			System.out.print(String.format("%.1f",arp)+"% ");
			for(int y=15;y<=30;y=y+5)						
			{
				int nopayments=y*12;							
				double arp1=arp*0.01/12;						
				double temp=Math.pow((1+arp1),nopayments);		
				double payment=amt*arp1*temp/(temp-1);			
				System.out.printf("%15.2f",payment);			
			}
			System.out.println();
		}
	}
}
