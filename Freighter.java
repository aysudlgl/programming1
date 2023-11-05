
public class Freighter extends Ship {
	public double capacity;
	
	public Freighter( String name, int crew, double tons ) {
		super( name, crew );
		capacity = tons;
	}
	
	public double getCapacity() { return capacity ; }
	public void setCapacity( double tons ) { capacity = tons; }
	
	public String toString() {
		return super.toString() + 
				String.format( "Capacity: %.1f\n", capacity );
		
	}

}

