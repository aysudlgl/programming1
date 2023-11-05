
import java.util.Scanner;
public class Backward {
	public static void main(String args[])

	
		{
	Scanner scnr = new Scanner(System.in);
	String original;
	String reverse = "";
	
	
	original = scnr.nextLine();  
	

	int length = original.length();

	for (int i = length - 1 ; i >= 0 ; i--)

	reverse = reverse + original.charAt(i);

	System.out.printf(reverse);

	}
	}
