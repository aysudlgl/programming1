
public class Ship {
	
	
		
		   int crew;
		   String name;

		   public Ship(String name1, int crewShip)
		    { crew = crewShip;
		      name = name1;
		    }
		   
		     public void setCrew(int crewShip)
		     { crew = crewShip;} 

		     public void setName(String name1)
		     { name = name1;} 

		  
		     public int getCrew()
		     { return crew; }

		     public String getName()
		     { return name; }

		   public String toString() 
		     {
		      return  String.format("Name: %s\n", name ) +
		                   String.format("Crew: %d\n", crew);

		     }
		  }    
