package am;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrameEx3Ans extends JFrame {
	
	// 화면에 보이는 객체들을 멤버변수로 선언
	
	JLabel lb;
	JTextField tf;
	JButton bt;
	JPanel p1;
	JTextArea ta;
	
	public MyFrameEx3Ans() {
		
		// 필요한 객체 모두 생성
		
		lb = new JLabel("URL: ");
		tf = new JTextField(20);
		bt = new JButton("확인");
		
		p1 = new JPanel();
		p1.add(lb);
		p1.add(tf);
		p1.add(bt);
		
		// JLabel, JTextField, 그리고 JButton을 가진 p1을
		// 현재 창의 North 영역에 추가!
		
		this.add(p1, BorderLayout.NORTH);
		
//		ta = new JTextArea();
//		this.add(ta);
		
		this.add(ta = new JTextArea());
		
		
		
		this.setBounds(300, 200, 500, 600);
		this.setVisible(true);
		
		// 종료이벤트 감지자 등록
		this.addWindowListener(new MyWinAdpt());
		
		
	}
	
	

	public static void main(String[] args) {

		new MyFrameEx3Ans();

	}

}
