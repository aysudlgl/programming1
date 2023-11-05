import java.util.Scanner;

public class HelloWorld {
	public static void main( String[] args )
	 {
	 Scanner console = new Scanner( System.in );
	 System.out.println("Hello world!");
	 System.out.println("What's your name?");
	 String name = console.next();
	 System.out.println("Hello, " + name + ".");
	 console.close();
	
}
}