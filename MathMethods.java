import java.util.Scanner; 

public class MathMethods {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
double x;
double y;
double z;

x = scnr.nextDouble();
y = scnr.nextDouble();
z = scnr.nextDouble();

System.out.print(Math.pow(x,z) + " " );
System.out.print(Math.pow(x, Math.pow(y,z))+ " ");
System.out.print(Math.abs(y) + " ");
System.out.print(Math.sqrt(Math.pow(x*y,z)));
scnr.close();
}
}