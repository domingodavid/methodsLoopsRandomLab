import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Part1 extends JPanel {
	
	//"global variables"
	Random rnd = new Random(1234);

	public void paint(Graphics g) {

		// Draw Grid
		g.drawRect(10, 10, 780, 580);
		g.drawLine(400, 10, 400, 590);
		g.drawLine(10, 300, 790, 300);

		
		
		
		
		
		
		
		

	}// my code should go above this bracket unless I know about classes

	public static void main(String[] arg) {
		// line of code to create a MethodPractice object
		Part1 m = new Part1();

	}// end of main method body

	public Part1() {
		JFrame f = new JFrame("Loops and Random Numbers");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(820, 640);
		f.add(this);
		f.setVisible(true);

	}

}// last curly - do not delete