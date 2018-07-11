package section3;
import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("Hello");
	String Input = JOptionPane.showInputDialog("name?");
	
	JOptionPane.showMessageDialog(null, "Hi "+ Input);
} 
}
