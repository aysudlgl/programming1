

public class Commercial extends Building {
	private String businessName;
	private int numEmployees;
	private boolean foodService;
	
	public Commercial( String own, String addr,
			double sqft,String name, int nEmp, boolean food )
	{
		super (own, addr, sqft );
		businessName = name;
		numEmployees = nEmp;
		foodService = food;
		
	}
	public String getBusinessName() { return businessName; }
	public void setBusinessName(String bName) { businessName = bName;}
	
	public int getNumEmployees() { return numEmployees; }
	public void setNumEmployees( int numEmp) { numEmployees = numEmp; }
	
	public boolean isFoodService() { return foodService;}
	public void setFoodService(boolean food) {foodService = food;}
	
	
	public String toString() {
		String str = "" + super.toString() + 
				String.format("Business Name : %s\n", businessName) +
				String.format("Employees : %d\n", numEmployees)  +
				String.format("Food : %b\n",  foodService);
		return str;
		
	}
	
}
