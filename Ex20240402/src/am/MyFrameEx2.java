package am;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrameEx2 extends JFrame {
	
	JButton btn1, btn2, btn3;
	JPanel pnl;
	
	public MyFrameEx2() {
		/*
		this.setSize(500, 600);		// 창의 크기설정
		this.setLocation(400, 200); // 창의 위치설정
		*/
		
		// button 만들기
		
		btn1 = new JButton("RED");
		btn2 = new JButton("GREEN");
		btn3 = new JButton("BLUE");
		
		
		// 생성한 button들 panel에 배치하기
		pnl = new JPanel(); // 기본으로 FlowLayout이다. 
							// 다른 Layout 종류에는 GridLayout, CardLayout 등이 있다.
		
		pnl.add(btn1); // 이렇게 add해주면 add한 순서대로 배치된다.
		pnl.add(btn2); // [ btn1 ] [ btn2 ] [ btn3 ]
		pnl.add(btn3); // 위의 순서로 배치되고 저장된다.
				
		// button을 배치한 현재 창에 panel 배치하기
		
		this.add(pnl, BorderLayout.NORTH);
		
		
		this.setBounds(400, 200, 500, 600); // setSize + setLocation : 위치와 크기 설정 한번에!
		
		this.setVisible(true);
		
		this.addWindowListener(new MyWinAdpt());
		
	} // 생성자의 끝
	

	public static void main(String[] args) {
		// 프로그램 시작

		new MyFrameEx2();
		
	}

}
