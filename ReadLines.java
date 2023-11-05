import java.util.Scanner;
import java.io.*;

public class ReadLines {
	public static void main( String [] args ) 
	{
		Scanner console = new Scanner( System.in );
		//System.out.print("Enter the filename to read (include .txt): ");
                          System.out.print("Enter the filename to read: "); //makes zyBooks happy
                          //Suggest data11.txt
		String filename = console.next();
		File fileHandle = null;
		Scanner out = null;
		
	  // Open the file to scan the content. Determine the total number
	  // of delimited tokens with next();
	  try {
		fileHandle = new File( filename );  // these two statements bind
		out = new Scanner( fileHandle );   // filename to out

		String record;
		int count = 0;
		while( out.hasNext() ) 
                          {
			record = out.next();
			count++ ;
		}
		System.out.printf( "%s contains %d tokens.\n", filename, count );
		
	  // Reset & open the file to scan the content. Determine the total 
              // number of lines using a loop, hasNext(), and nextLine();
		out.close(); 					// reset the file
		out = new Scanner( fileHandle ); // reopen
		count = 0;
		while( out.hasNext() ) {
			record = out.nextLine();
			count++ ;
		}
		System.out.printf( "%s contains %d lines.\n", filename, count );
		
	  // Reset & open the file. Display the tokens as a table of data
	  // The delimiter character is " +" (any number of spaces).
		out.close(); 					
		out = new Scanner( fileHandle ); 
	  
		double value;
		String [] tokens;
		while ( out.hasNext() ) {
			tokens = out.nextLine().trim().split(" +");
			for ( String target : tokens ) {
				value = Double.parseDouble( target.trim() );
				System.out.printf( "%12.4f", value );
			}
			System.out.println();
		}
		System.out.println( "Done!");
	  } catch ( FileNotFoundException err ) {
		  System.out.println( "Error: " + err  + " try again.");
      }
        if ( out != null ) out.close();
		  if ( console != null ) console.close();
	
	}
}

