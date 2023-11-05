
public class Pet {
	protected String petName;
	   protected int petAge;


	public void setName(String userName) {
	      petName = userName;
	   }

	   public String getName() {
	      return petName;
	   }

	   public void setAge(int userAge) {
	      petAge = userAge;
	   }

	   public int getAge() {
	      return petAge;
	   }

	   public String toString() {
	      return       String.format("Pet Information: \n") +
	                   String.format("   Name: %s\n", petName ) +
	                   String.format("   Age: %d", petAge);
	      				
	   }

	}