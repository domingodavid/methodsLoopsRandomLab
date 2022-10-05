import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Part2 extends JPanel   {
	
	//"global variables"
	Random rnd = new Random(1234);
	int red = 0, green = 128, blue = 0;
	int angle = 0;
	int radius = 300;
	int offset = 180;
	int y = 0;
	public void paint(Graphics g) {
		
		g.drawRect(10, 10, 780, 580);


		

	}// my code should go above this bracket unless I know about classes

	public static void main(String[] arg) {
		// line of code to create a MethodPractice object
		Part2 m = new Part2();

	}// end of main method body

	public Part2() {
		JFrame f = new JFrame("Loops and Random Numbers");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(820, 640);
		f.add(this);
		f.setVisible(true);
	}

}// last curly - do not delete