import java.util.Scanner;

public class NameFormat {
	public static void main(String[] args) {
        Scanner scnr = new Scanner ( System.in);
        
        
	String name = scnr.nextLine();
	String[] words = name.split(" ");
	String firstName = words[0];
	String middleName = words [1];
	 if  (words.length == 2)
			 { 
	
		 System.out.println(middleName + "," + firstName);
	
	 }

	 else{
		String lastName = words[2];
		System.out.println(lastName + ", " + firstName  + " "+ middleName.charAt(0) + ".");
		
	}
	}
}