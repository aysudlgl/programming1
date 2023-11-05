
public class Liner  extends Ship {
public int passengers;
	
	public Liner( String name, int crew, int pass ) {
		super( name, crew );
		passengers = pass;
	}
	
	public int getPassengers() { return passengers ; }
	public void setPassengers( int pass ) { passengers = pass; }
	
	public String toString() {
		return super.toString() + 
				     String.format( "Passengers: %d\n", passengers );
	}

}



