import java.util.Scanner;

public class Triangle 
{


	
	   private double base;
	   private double height;
	   
	   public Triangle( ) 
	   { // no-arg constructor
		   base = 0.0;
		   height = 0.0;
	    }
	   
	   public void setBase(double userBase)
	   {
	      base = userBase;
	   }
	   public void setHeight(double userHeight) 
	   {
	      height = userHeight;
	   }
	   
	   public double getArea() 
	   {
	      double area = 0.5 * base * height;
	      return area;
	   }
	   
	   public String toString() 
	    {
	      String str = String.format("Base: %.2f\n", base) +
	                   String.format("Height: %.2f\n", height) +
	                   String.format("Area: %.2f\n", getArea());
	      return str;
	   }
	}


