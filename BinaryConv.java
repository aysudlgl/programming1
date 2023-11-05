import java.util.Scanner;

public class BinaryConv {

	public static void main(String[] args) {
		   
		Scanner scnr = new Scanner( System.in );
		
	int userNum =  scnr.nextInt();  
	
	int[] binary = new int[35];
	int id = 0;
	 if(userNum==0){
         System.out.println(0);
         
}

	  else if(userNum < 0){
          System.exit(0);
      }
	  else{
			// number should be positive
			while (userNum > 0) {
				binary[id++] = userNum % 2;
				userNum = userNum / 2;
			}
	       
	         
			for (int i = id - 1; i >= 0; i--)
				System.out.printf(binary[i] + "");
	        }
}
}