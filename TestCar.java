import java.util.Scanner;

public class TestCar 
{
	public static void main( String [] args )
              {
		System.out.println("Enter the make, model and year as: make, model, year");
		Scanner console = new Scanner( System.in );
		String [] tokens = console.nextLine().split(",");
		
		String make = tokens[0].trim();
		String model = tokens[1].trim();
		int year = Integer.parseInt( tokens[2].trim() );
		
		// instantiate the Car object, myCar :
		Car myCar = new Car( make, model, year );
		
		// Show the state of myCar with toString 
		System.out.println( myCar.toString() );
		
		// Demonstrate the getters and setters work correctly with yourCar.
		// "Ford", "Mustang", 1968   (should be 2020 not 1968)
		
		Car yourCar = new Car();
		
		yourCar.setMake("Ford");
		yourCar.setModel("Mustang");
		yourCar.setYear(2020);    //zyBooks error:  2020 is correct
		
                             System.out.print(yourCar.toString());
		//System.out.printf( "Make : %s\n", yourCar.getMake() );
		//System.out.printf( "Model : %s\n", yourCar.getModel() );
		//System.out.printf( "Year : %d\n", yourCar.getYear() );
		
	}
}
