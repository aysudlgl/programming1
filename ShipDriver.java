import java.util.Scanner;
public class ShipDriver {
	
	{
		public static void main( String [] args )
		{
			Scanner sc = new Scanner(System.in);
			String name;
			int crew;
			double capacity;	
		
			System.out.println("Enter a Freighter name, crew number, and capacity: name, crew, capacity");
			String s=sc.nextLine();
			String st[]=s.split(",");
			name=st[0];
			crew=Integer.parseInt(st[1]);
			capacity=Double.parseDouble(st[2]);
	    
	    		Ship aShip = new Ship( name, crew, capacity);
	    		System.out.println(aShip.toString());   
		}
	} 