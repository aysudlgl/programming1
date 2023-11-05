import java.util.Scanner;
public class PetDriver {
	
		public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);

		Pet myPet = new Pet();
		Dog myDog = new Dog();
		String petName, dogName, dogBreed;
		int petAge, dogAge;
		
		String[] tokens;
		
		    System.out.println("Enter generic pet name and age as: name, age" );
		    tokens = scnr.nextLine().split(",");
		    petName = tokens[0].strip();
		    petAge = Integer.parseInt( tokens[1].strip());
		    
		    myPet.setName( petName);
		    myPet.setAge( petAge);
		    System.out.println( myPet.toString());
			
		    System.out.println();
		    
		    System.out.println("Enter dog pet name, age, and breed as: name, age, breed" );
		    tokens = scnr.nextLine().split(",");
		    dogName = tokens[0].strip();
		    dogAge = Integer.parseInt( tokens[1].strip());
		    dogBreed= tokens[2].strip();
		    
		    myDog.setName( dogName);
		    myDog.setAge( dogAge);
		    myDog.setBreed(dogBreed);
		 
		    System.out.println( myDog.toString());
			
		    System.out.println("   Breed: " + myDog.getBreed());

		      scnr.close();
		}
	}