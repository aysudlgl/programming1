import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class Lab14ArrayList {
	public static void main(String[] args) throws IOException {

		// Variable for file name
		String filename = null;

		// Scanner to read file name from user
		Scanner scnr = null;

		// Scanner to read
		Scanner tokens = null;

		// Variable for value read from the file
		double value = 0.0;

		// 1. Instantiate an ArrayList object named myList for type Double.
		ArrayList<Double> myList = new ArrayList<Double>();

		// This logic will use the command line argument or prompt for input:
		if (args.length != 0) // args is an array!
		filename = args[0];
		else {
		scnr = new Scanner(System.in);
		filename = scnr.nextLine().strip();
		}

		// 2. Open the file to read using the File and Scanner classes:
		// Create File object using filename
		File fHandle = new File(filename);

		// Instantiate tokens
		tokens = new Scanner(fHandle);

		// This counts the numbers as they are read.
		int counter = 0;

		// put first item in list.
		myList.add(tokens.nextDouble());
		++counter; // Count it.

		// Read the rest of the file for tokens
		while (tokens.hasNext()) {
		// 3. Get the next number from the data file.
		value = tokens.nextDouble();

		// 4. Place the current number into your list and count it.
		myList.add(value);
		} // repeat until all numbers are loaded into the ArrayList.

		// 5. Confirm your ArrayList is populated with the data by printing
		for(Double dataValue: myList)
		System.out.printf("%.3f\n", dataValue);

		// Close scnr
		if (scnr != null) {
		scnr.close();
		}

		// Close tokens
		if (tokens != null) {
		tokens.close();
		}
		}
		
}
