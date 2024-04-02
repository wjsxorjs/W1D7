package am;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrameEx4 extends JFrame {
	
	// 원하는 객체들을  멤버로 선언
	JCheckBox cb1, cb2, cb3, cb4;
	JTextArea ta;
	
	//체크박스 4개를 담을 JPanel을 하나 준비하자
	JPanel p1;
	GridLayout gl;
	
	
	public MyFrameEx4() {

		// WEST영역 작업
		gl = new GridLayout(6, 1);
		p1 = new JPanel(gl);
		
		cb1 = new JCheckBox("항목1");
		cb2 = new JCheckBox("항목2");
		cb3 = new JCheckBox("항목3");
		cb4 = new JCheckBox("항목4");
		
		// 생성된 체크박스들을 p1에 추가
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		
		// p1을 현재 창 WEST영역에 추가
		this.add(p1,BorderLayout.WEST);
		
		// 현재 창(Center)에 JTextArea 추가
		this.add(ta = new JTextArea());
		
		this.setBounds(500, 150, 500, 300);
		this.setTitle("My Frame V0.57");
		this.setVisible(true);
		
		// 종료이벤트 감지자 등록
		this.addWindowListener(new MyWinAdpt());
		
	}
		

	public static void main(String[] args) {
		
		
		
		new MyFrameEx4();

	}

}
