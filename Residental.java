
public class Residental {
private int numBedrooms;
private int numBathrooms;
private boolean garage ;

public Residental(String own,String addr, double sqFt, int numBeds,
		int numBaths, boolean gar)
{
	super (own, addr, sqFt) ;
	numBedrooms = numBeds;
	numBathrooms = numBaths;
	garage = gar;
}
	public int getNumBedrooms() { return numBedrooms;}
	public void setNumBedrooms( int numBeds) { numBedrooms = numBeds;}
	
	public int getNumBathrooms() { return numBathrooms;}
	public void setNumBathrooms( int numBaths) { numBathrooms = numBaths;}
	
	
	public boolean hasGarage() { return garage;}
	public void setGarage(boolean gar) {garage = gar;}
	
	public String toString() {
		
		String str = super.toString() +
		String.format("Bedrooms: %d\n" , numBedrooms ) +
		String.format("Bathrooms: %d\n" , numBathrooms ) +
		String.format ( "Garage : %b\n", hasGarage () );
		return str;
	
	}
}

