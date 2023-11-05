import java.util.Scanner;

public class TriangleDriver {
	public class TriangleDriver 
	{
	   public static void main(String[] args) 
	   {
	      Scanner scnr = new Scanner(System.in);
	      
	      Triangle triangle1 = new Triangle();
	      Triangle triangle2 = new Triangle();

	      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
	      double base = scnr.nextDouble();
	      double height = scnr.nextDouble();
	      triangle1.setBase( base );
	      triangle1.setHeight( height );
	      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
	      
	      base = scnr.nextDouble();
	      height = scnr.nextDouble();
	      triangle2.setBase( base );
	      triangle2.setHeight( height );
	      
	      System.out.println("Triangle with larger area:");
	      

	      // TODO: Determine larger triangle (use getArea())
	      if ( triangle1.getArea() > triangle2.getArea() ) 
	    	  System.out.println( triangle1.toString() );
	          else 
	    	  System.out.println( triangle2.toString() );   
	   }
	}
}


