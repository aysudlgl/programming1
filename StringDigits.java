import  java.util.Scanner;

public class StringDigits {
	public static void main(String[] args) {
		   
		Scanner scnr = new Scanner( System.in );
		
		String input = "";
		
		
		input = scnr.nextLine();  
		
		String digit="";
		String letters="";
		char character=' ';
		
		for(int i=0;i<input.length();++i)
		{
		character=input.charAt(i);
		if(character>='0'&&character<='9')
		{
		//it is a digit
		digit+=character;
		}
		else
		{ //if not an digit
		letters+=character;
		}
		}
		System.out.println(digit);
		System.out.println(letters);
		}
		
	}

