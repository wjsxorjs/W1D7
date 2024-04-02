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

public class MyFrameEx3 extends JFrame implements ActionListener{
	
	JTextField txtFld;
	JButton btn;
	
	JPanel pnl;
	
	JTextArea txtArea;
	
	public MyFrameEx3() {
		
		btn = new JButton("구구단");
		
		
		txtFld = new JTextField(3);

		pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		pnl.add(txtFld);
		pnl.add(btn);

		txtArea = new JTextArea();
		
		this.add(pnl,BorderLayout.NORTH);
		this.add(new JScrollPane(txtArea)); // 스크롤바와 함께 textArea 추가
		
		this.setBounds(400, 150, 500, 300);
		this.setVisible(true);
		
		
		//EventListeners
		this.addWindowListener(new MyWinAdpt());
		btn.addActionListener(this);
		
	}

	public static void main(String[] args) {
		/*
		    [입력칸] [버튼]
		    
		    [ 구구단 출력 ]
		 */

		new MyFrameEx3();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String txt = txtFld.getText().trim();
		
		StringBuffer sb = new StringBuffer();
		
		if(!(txt.length() == 0)) {
			int dan = Integer.parseInt(txt);
			
			sb.append("========== ");
			sb.append(dan);
			sb.append("단 ");
			sb.append("==========\r\n");
			
			for(int i=1; i<=9; i++) {
				sb.append(dan);
				sb.append(" X ");
				sb.append(i);
				sb.append(" = ");
				sb.append(dan*i);
				sb.append("\r\n");
				
			}
		}
		//textArea에 문자열로 설정!
		txtArea.setText(sb.toString());
	}

}
