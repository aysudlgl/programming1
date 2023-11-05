public class Car {



   private String make; 
   private String model;
   private int year;
   
//Constructor
   public Car ()
   {    make = "";
	   model = "";
	   year = 0;         
   }
   public Car(String make1, String model1, int year1)
   {
      make = make1;
      model = model1;
      year = year1; 
   }
//Get Methods
   public int getYear()
   { return year; }

   public String getMake()
   { return make; }

   public String getModel()
   { return model; }

//Mutator or Set value Methods
   public void setYear(int year1)
   { year = year1; }

   public void setMake(String make1)
   { make = make1; }

   public void setModel(String model1)
   { model = model1; }

   public String toString()
   {
      return "\nMake: " + make + 
    		 "\nModel: " + model + 
             "\nYear: " + year;
   }
}//end Car


