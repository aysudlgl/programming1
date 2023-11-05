import java.util.Scanner;

public class SumDigits {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner( System.in );
		
		int number = scnr.nextInt();
		
		int result = sumDigits(number);
		
		System.out.print( result );
		
		scnr.close();
	}
	public static int sumDigits(int num) {
   if (num==0)
	   return 0;
   else 
   return (num % 10 + sumDigits(num / 10));
   
}

}