import java.util.Scanner;
public class ColorRange {
	public static void main(String[] args) {
		Scanner console = new Scanner( System.in );

		String color = console.next();

		
			switch (color.toLowerCase()) {
			
			 case "infra-red":
			System.out.println("Infra-red: greater than 0.700 microns");
			 break;
			 case "red":
		    System.out.println("Red: 0.647-0.700 microns");
		    break;
			 case "orange":
		 System.out.println("Orange: 0.585-0.647 microns");
				 break;
			 case "yellow":
				 System.out.println("Yellow: 0.575-0.585 microns");
				  
			break;
			  case "green":
				  System.out.println("Green: 0.491-0.575 microns") ;
			  break;
			  
			  case "blue":
				  System.out.println("Blue:0.424-0.491 microns");
				  		break;
				  		
			  case "violet":
				  System.out.println("Violet: 0.400-0.424 microns");
				 
			break;
			  case "ultra-violet":
				  System.out.println("Ultra-violet: at most 0.400 microns");
				   break;
			
			default:
		   	System.out.printf("Unknown color");
		}
		
		console.close();
	   }   	// end main
	}		// end class


