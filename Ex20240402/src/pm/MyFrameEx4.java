package pm;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import am.MyWinAdpt;

public class MyFrameEx4 extends JFrame {
	
	
	JLabel lb1, lb2, lb3, lb4;
	
	JPanel p1;
	
	public MyFrameEx4() {
		
		p1 = new JPanel();
		
		ImageIcon icon1 = new ImageIcon("src/images/blog.png");
		ImageIcon icon2 = new ImageIcon("src/images/cafe.png");
		ImageIcon icon3 = new ImageIcon("src/images/mail.png");
		ImageIcon icon4 = new ImageIcon("src/images/stock.png");
		
		//생성된 image 아이콘을 lb1 생성할 때 넣어준다.
		lb1 = new JLabel(icon1); // Icon은 ImagesIcon의 조상
		lb2 = new JLabel(icon2);
		lb3 = new JLabel(icon3);
		lb4 = new JLabel(icon4);
		
		p1.add(lb1);
		p1.add(lb2);
		p1.add(lb3);
		p1.add(lb4);
		
		this.add(p1,BorderLayout.CENTER);
		
		this.setBounds(300, 200, 350, 250);
		this.setVisible(true);
		
		this.addWindowListener(new MyWinAdpt());
		
	}
	
	
	public static void main(String[] args) {
		new MyFrameEx4();

	}

}
