import java.util.Scanner;

public class RemoveBias {
	public static void main(String[] args) {

		Scanner console = new Scanner( System.in );
		System.out.print("Enter a comma separated list of numbers: ");
		
		String [] inpStrings = console.nextLine().split(",");
		int idx;
		double avg = 0.0;


		double [] data = new double[inpStrings.length]; 
		
	
		for ( idx=0; idx < data.length; idx++ )
	
		{
			
		data[idx] = Double.parseDouble( inpStrings[idx].trim());
		
		avg = avg + data[idx];
		}
		
		avg = avg / data.length;
		
		
		for ( idx = 0; idx < data.length; idx++)
		{
			data[idx] = data[idx] - avg;
			System.out.printf("data[%d] = %.2f\n", idx, data[idx]);
		}
		
		console.close();
	}
}

