import java.util.Scanner;
public class hhj {
	public static void main(String[] args) {
		int ir, ic;
		Scanner console = new Scanner(System.in);

		int[][] array2D = { { 7,2,9,8 },
		{ 6,5,4,0,2 },
		{ 1,2,3, } };
		//1. Display 2-D array
		for(int i=0; i<array2D.length; i++){
		for(int j=0; j<array2D[i].length; j++){
		System.out.print(array2D[i][j]+" ");
		}
		System.out.println();
		}
		//2. Display the number of array element. And add logic to longest row
		int total = 0;
		int longrow = 0;
		for(int i=0; i<array2D.length; i++){
		int temp = 0;
		for(int j=0; j<array2D[i].length; j++){
		total++;
		temp++;
		}
		if(temp > longrow){
		longrow = temp;
		
		}
		}
		System.out.println("Total number of array elements: "+total);
		
		
		System.out.printf("Row index 1, has "+  longrow + " members.\n");

		//3.Sum all array elements and display total:
		int sumOfElements = 0;
		for(int i=0; i<array2D.length; i++){
		for(int j=0; j<array2D[i].length; j++){
		sumOfElements += array2D[i][j];
		}
		}
		System.out.println("Sum of all array elements: "+sumOfElements);

		//4. Select and display a Column given its index:
		System.out.print("Enter a column index to display: ");
		ic = console.nextInt();
		for(int i=0; i<array2D.length; i++){
		for(int j=0; j<longrow; j++){
		if(j == ic){
		try {
		System.out.println(array2D[i][j]);
		} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Empty");
		}
		}
		}
		}

		}

		}
