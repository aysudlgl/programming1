import javax.swing.JOptionPane;

public class Interact 
{
public static void main(  String args [] )
{
	String msg = "What is your name? /n";
	String name = JOptionPane.showInputDialog( msg );
	msg = "/nHello," + name + "!/n/n";
	JOptionPane.showMessageDialog( null, msg );

}
}
