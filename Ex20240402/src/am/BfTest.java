package am;

import java.awt.Color;

import javax.swing.JFrame;

public class BfTest extends JFrame {
	
	BfTestWL btWL;
	
	public BfTest() {
		this.setSize(500, 600);
		this.setLocation(500, 150);
		this.setTitle("My Frame Test 2");
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
				
		btWL = new BfTestWL();
		
		this.addWindowListener(btWL);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		new BfTest();

	}

}
