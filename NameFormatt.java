import java.util.Scanner;

public class NameFormatt {
	public static void main(String[] args) {
        Scanner scnr = new Scanner ( System.in);
        
        
	String name = scnr.nextLine();
	String[] words = name.split(" ");
	String firstName = words[0];
	String middleName = words [1];
	 if (words.length == 2);
	System.out.println(middleName + "," + firstName.charAt(0) + "." );

		String lastName = words[2];
		System.out.println(lastName + "," + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
		
	}
		
	}
