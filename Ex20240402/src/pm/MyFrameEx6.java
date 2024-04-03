package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import am.MyWinAdpt;

public class MyFrameEx6 extends JFrame implements ActionListener {
	
	JButton btn;
	
//	JLabel[] lotto;
	
	JPanel panel1, panel2;
	
	public void lottoNum() {
		// 정수 6개를 저장하는 배열 생성
		int[] lottoTmp = new int[6];
			
		// 1~45까지의 수들 중 난수를 발생하여 lotto라는 배열에
		// 저장시킨다. 단, 중복이 되어서는 안된다.
			
		for(int i=0;i<lottoTmp.length; /*i++*/) {				// 증감식 생략 가능
			int lotNum = (int) (Math.random() * 45 + 1); 	// 난수 생성
			//중복체크를 위한 반복문
			boolean chk = true; 							// 중복되지않았을때 true, 중복됐을 때 false로 정한다.
			for(int j=0; j<i; j++) {						//1개라도 중복되었을 때만 chk를 false로 바꾼다.
				if(lotNum == lottoTmp[j]) {
					chk = false;
					break; 									// 이미 찾았으므로 불필요한 반복문 탈출
				}
			} // 해당 반복문의 결과는 "중복되었느냐, 중복되지않았느냐"로 나온다.
			
			if(chk) {
				lottoTmp[i] = lotNum;
//				ImageIcon icon = new ImageIcon ("src/images/lotto/"+lotNum+".gif");
//				panel2.add(new JLabel(icon));
				i++;
			}
		}
		
		this.imageGen(lottoTmp);

	}
	
	// 이미지 넣어주는 함수를 따로 뺌
	public void imageGen(int[] lotNum) {
		for(int i=0; i<lotNum.length; i++) {
			ImageIcon icon = new ImageIcon ("src/images/lotto/"+lotNum[i]+".gif");
			panel2.add(new JLabel(icon));
		}
	}
	
	public MyFrameEx6() {
		
		panel2 = new JPanel();
		
		btn = new JButton("생성");
		
		btn.addActionListener(this);
		
//		lotto = new JLabel[6];
		
		this.lottoNum();
		
//		for(int i=0; i<6; i++) {
//			panel2.add(lotto[i]);
//		}

		panel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel1.add(btn);
		
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2);
		
		this.setBounds(150, 300, 600, 350);
		this.setVisible(true);
		
		this.addWindowListener(new MyWinAdpt());
		
		
	}
	
	

	public static void main(String[] args) {

		new MyFrameEx6();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		panel2.removeAll();
		this.lottoNum();
//		for(int i=0; i<6; i++) {
//			panel2.add(lotto[i]);
//		}
//		this.add(panel2);
//		this.setVisible(true);
		panel2.revalidate();
	}

}
