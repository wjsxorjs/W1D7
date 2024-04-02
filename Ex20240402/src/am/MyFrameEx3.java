package am;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrameEx3 extends JFrame {
	
	JLabel label;
	JTextField txtFld;
	JButton srchBtn;	
	
	JTextArea txtArea;
	
	JPanel northPnl;
	
	
	public MyFrameEx3() {
		
		
		
		label = new JLabel("URL: ");
		txtFld = new JTextField(20);
		srchBtn = new JButton("확인");
		
		northPnl = new JPanel();
		
		northPnl.add(label);
		northPnl.add(txtFld);
		northPnl.add(srchBtn);
		
		txtArea = new JTextArea();
		
		this.add(northPnl,BorderLayout.NORTH);
		this.add(txtArea);		
		
		
		this.setSize(500, 600);
		this.setLocation(300, 150);
		
		this.setVisible(true);
		
		this.addWindowListener(new MyWinAdpt());
	}
	

	public static void main(String[] args) {

		new MyFrameEx3();
		

	}

}
