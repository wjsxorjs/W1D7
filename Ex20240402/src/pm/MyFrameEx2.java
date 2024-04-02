package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import am.MyWinAdpt;

public class MyFrameEx2 extends JFrame implements ActionListener{

	JPanel p1;
	JTextField input;
	JButton bt;
	JTextArea ta;
	
	
	public MyFrameEx2() {
		
		p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
				
		input = new JTextField(10);
		bt = new JButton("확인");
		
		p1.add(input);
		p1.add(bt);
		
		
		
		// p1을 현재객체의 North 영역에 추가
		this.add(p1, BorderLayout.NORTH);
		
		ta = new JTextArea();
		this.add(new JScrollPane(ta));
		
		this.setBounds(400, 150, 500, 300);
		this.setVisible(true);
		
		// 이벤트 감지자 등록
		// 종료이벤트
		this.addWindowListener(new MyWinAdpt());
		
		bt.addActionListener(this);
		
		
		
	}
	
	
	
	public static void main(String[] args) {

		new MyFrameEx2(); 

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// input안에 있는 문자열을 가져와서 JTextArea에 추가
		String msg = input.getText();
		ta.append(msg);
		ta.append("\r\n");
		
		
	}

}
