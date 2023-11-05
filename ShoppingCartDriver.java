import java.util.Scanner;
public class ShoppingCartDriver {

	  public static void main(String[] args) {
	        Scanner scnr= new Scanner(System.in);
	        ItemToBuy item1=new ItemToBuy();
	        ItemToBuy item2=new ItemToBuy();
	        String productName;
	        double productPrice=0.0;
	        int productQuantity=0;
	        double cartTotal=0.0;

	        String [] tokens = null;

	        System.out.println("Item 1");
	        System.out.println("Enter comma separated list: name, price, quantity:");
	        tokens = scnr.nextLine().split(",");

	        productName = tokens[0].strip();
	        productPrice = Double.parseDouble( tokens[1].strip() );
	        productQuantity = Integer.parseInt( tokens[2].strip() );


	        item1.setItemName(productName);
	        item1.setItemPrice((int) productPrice);
	        item1.setItemQuantity(productQuantity);

	        tokens = null;
	        System.out.println("Item 2");
	        System.out.println("Enter comma separated list: name, price, quantity:");
	        tokens = scnr.nextLine().split(",");

	        productName = tokens[0].strip();
	        productPrice = Double.parseDouble( tokens[1].strip() );
	        productQuantity = Integer.parseInt( tokens[2].strip() );

	        item2.setItemName(productName);
	        item2.setItemPrice((int) productPrice);
	        item2.setItemQuantity(productQuantity);

	        double item1Cost = item1.getItemPrice()*item1.getItemQuantity();
	        double item2Cost =item2.getItemPrice()*item2.getItemQuantity();
	        cartTotal=item1Cost+item2Cost;
	        System.out.println("Items Receipt:");
	        System.out.println(item1.toString()+"$"+item1Cost);
	        System.out.println(item2.toString()+"$"+item2Cost);
	        System.out.printf("Total: $%.2f\n", cartTotal);
	    }
	}

