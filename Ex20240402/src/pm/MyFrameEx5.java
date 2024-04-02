package pm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import am.MyWinAdpt;

public class MyFrameEx5 extends JFrame implements ActionListener {
	
	JButton bt1, bt2, bt3, bt4;
	JPanel p1;
	
	JTextField tf;
	
	public MyFrameEx5() {

		ImageIcon icon1 = new ImageIcon("src/images/blog.png");
		ImageIcon icon2 = new ImageIcon("src/images/cafe.png");
		ImageIcon icon3 = new ImageIcon("src/images/mail.png");
		ImageIcon icon4 = new ImageIcon("src/images/stock.png");
		
		
		bt1 = new JButton(icon1);
		bt2 = new JButton(icon2);
		bt3 = new JButton(icon3);
		bt4 = new JButton(icon4);
		
		p1 = new JPanel();
	
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		p1.add(bt4);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		
		this.add(p1);
		
		tf = new JTextField();
		
		this.add(tf, BorderLayout.NORTH);
		
		
		this.setBounds(300, 200, 350, 250);
		this.setVisible(true);
		
		this.addWindowListener(new MyWinAdpt());
		
		
	}
	

	public static void main(String[] args) {

		new MyFrameEx5();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == bt1) {
			tf.setText("블로그");
		} else if (obj == bt2){
			tf.setText("카페");
		} else if (obj == bt3){
			tf.setText("메일");
		} else {
			tf.setText("주식");
		}
		
	}
	
	

}
