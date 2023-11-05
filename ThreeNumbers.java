import java.util.Scanner;

public class ThreeNumbers {
	   public static void main(String[] args) 
	   {
	
	      Scanner scnr = new Scanner(System.in);
	      int num1;
	      int num2;
	      int num3;
	      System.out.println("Enter first integer:");
	      num1 = scnr.nextInt();  
	      
	       System.out.println("You entered: "+ num1);
	       System.out.println(num1 + " times 3 is " + num1 * 3);
	       System.out.println("And " + num1 + " cubed is " + num1*num1*num1 + "!");
	       System.out.println("Enter second integer:");
	       num2 = scnr.nextInt();  
	       System.out.println("Enter third integer:");
	       num3 = scnr.nextInt();  
	       System.out.println(num1 + " + " + num2 + " + " + num3 + " is " + (num1 + num2 + num3));
	       System.out.println(num1 + " * " + num2 + " * " + num3 + " is " + num1 * num2 * num3); 
	   }

}
