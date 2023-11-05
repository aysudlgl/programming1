import java.util.Scanner; 
public class CalculatePi {
	   public static void main(String[] args)
	   {
	   Scanner console = new Scanner(System.in);
	   long iterations;
	   long printFrequency;
	   long inside = 0;
	   long outside =         
	   double piValue;
	   long i;
	   double x,y;
	   System.out.println("Enter number of iterations to calculate Pi (in Millions)");
	   iterations = 1000000 * console.nextLong();  
		   
	   System.out.println("How often to print estimate for Pi (in Millions)");
	   printFrequency = 1000000 * console.nextLong();     	   	   
		 for (i = 0; i < iterations; i++) 
		 {
		  x = Math.random();  // random real value between >=0 and <1
		  y = Math.random();
		  if (x * x + y * y <= 1) 
			  inside = inside + 1;  // point is inside the circle
			  else 
			  outside = outside + 1; // point is outside the circle
		  if (i%printFrequency ==0)	
			  {piValue = 4.0 * inside /(inside + outside);
			  System.out.println("Iteration " + i + " Pi estimate is " + piValue); 
		      }//end if
			    
	      }// end for loop
		  piValue = 4.0 * inside /(inside + outside);
		  System.out.println("Final Pi estimate is " + piValue); 
	  }// end main




}
