package pm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import am.MyWinAdpt;

public class MyFrameEx1 extends JFrame implements ActionListener{
	
	JButton bt1, bt2, bt3;
	JPanel p1, p2;
	

	public MyFrameEx1() {
		
		bt1 = new JButton("Red");
		bt2 = new JButton("Green");
		bt3 = new JButton("Blue");
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		// panel에 추가한다.
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		
		// window에 추가한다.
		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER); // BorderLayout.CENTER는 생략가능하다.
		
		// JAVA에서는 이벤트를 감지하는 감지자는 add...Listener의 형태를 띈다.
		
		this.setBounds(400, 150, 500, 300);
		this.setVisible(true);
		
		// 이벤트 감지자 등록
		// 종료이벤트
		this.addWindowListener(new MyWinAdpt());
		// 클릭이벤트
		bt1.addActionListener(this); // bt1을 클릭하면 this(현재 객체)에서 무조건 actionPerformed()를 호출한다.
		bt2.addActionListener(this); // bt2을 클릭하면 this(현재 객체)에서 무조건 actionPerformed()를 호출한다.
		bt3.addActionListener(this); // bt3을 클릭하면 this(현재 객체)에서 무조건 actionPerformed()를 호출한다.
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {

		new MyFrameEx1();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// Event가 발생할 때마다 호출되는 함수
		// 이벤트를 작동시킨 행위자가 누구인지 ActionEvent e로 들어온다.
		// 그래서 행위자에 따라 동작을 달리 해야한다면 e.getSource()로 행위자의 객체 정보를 가져오고
		// "주소값 비교"를 통해 행위자에 맞는 동작을 하도록 구현해준다.
		Object obj = e.getSource();
		if(obj == bt1) {
			p2.setBackground(Color.RED);
		} else if(obj == bt2) {
			p2.setBackground(Color.GREEN);
		} else {
			p2.setBackground(Color.BLUE);
		}
		
	}

}
