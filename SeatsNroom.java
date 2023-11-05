import java.util.Scanner;

public class SeatsNroom {
	public static void main(String[] args) {
		Scanner console = new Scanner( System.in );

		int room = console.nextInt();
		int seats = 0;

		if ( room < 101 || room > 116 )
			System.out.println( "Invalid room number, zero seats." );
		else {   
	         // change the if-control block to a switch
			switch (room) {
			
			 case 110 : case 101 : case 116 :
				   seats = 50;
			break;
			  case 111 : case 113 :
				   seats = 45;
			  break;
			  case 112:
			  case 114 :
				   seats = 35;
			break;
			default:
				   seats = 40;
				   break;
			}
		   	System.out.printf("Room number %d has %d seats.\n", room, seats );
		}
		
		console.close();
	   }   	// end main
	}		// end class
