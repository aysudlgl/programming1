import java.util.Scanner;

public class Lab3Grades {
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		double finalGrade = scnr.nextDouble();
		String finalLetter;
		
		if (finalGrade >=90) {
			finalLetter = "A";
		} else if (finalGrade >=80) {
			finalLetter = "B";
			
		} else if (finalGrade >=70) {
			finalLetter = "C"; 
		
		} else if (finalGrade >=60) {
			finalLetter = "D";
		
		} else {
			finalLetter = "F";
		}
		System.out.printf(finalLetter);
	}
}


