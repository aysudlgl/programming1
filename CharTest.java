
public class CharTest {
public static void main(String[] args) {
		
		char x = 'A';
		char y = 66;    //"B"
		char z = 'C';
		
		System.out.println(x);
		System.out.println(y);
	    System.out.println(z);
	   // y = y + 1;        FAILS: cannot add characters and integers.
       // char a = "A";     FAILS: cannot assign a String to a char
	   // String b = 'A';   FAILS: cannot assign a char to a String 
	    
	    
	   boolean c = x > y; 
	   System.out.println(c);
	   
	   boolean d = (x == 65);
	   System.out.println(d);
	   
	   char w = 'A';
	   boolean e = (w == x);
	   System.out.println(e);
	   
	}

}
