
	import java.util.Scanner;

	public class BoxDriver {

		public static void main(String[] args) {

			// scanner is class used to read primitive data types
			Scanner sc = new Scanner(System.in);

			// asking to user enter length
			System.out.print("length = ");

			// reading length
			double length = sc.nextDouble();

			// asking to user enter depth
			System.out.print("depth = ");

			// reading depth
			double depth = sc.nextDouble();

			// asking to user enter height
			System.out.print("height = ");

			// reading height
			double height = sc.nextDouble();

			// asking to user enter color
			System.out.print("color = ");

			// reading color
			String color = sc.next();

			// asking to user enter volume
			System.out.print("volume = ");

			// reading volume
			double volume = sc.nextDouble();

			// creating instance of Box
			Box box = new Box(length, depth, height, color);

			System.out.println();

			// calling to string method with use box object
			System.out.println(box.toString());

		}

	}


