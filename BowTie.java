import java.util.Scanner;

public class BowTie {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int userInputValue = scan.nextInt();

    int half = userInputValue/2 ; 
    {

    for(int i = 0;i<half;i++){
        for(int j = 0;j<=i;j++){
            System.out.print("*");
        }
        for(int j = 0;j<2*(half-i)-1;j++){
            System.out.print(" ");
        }
        for(int j = 0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
    for(int i = 0;i<userInputValue;i++){
        System.out.print("*");
    }
    
    System.out.println();
    for(int i = 0;i<half;i++){
        for(int j = i;j<half;j++){
            System.out.print("*");
        }
        for(int j = 0;j<2*i+1;j++){
            System.out.print(" ");
        }
        for(int j = i;j<half;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}
}
}