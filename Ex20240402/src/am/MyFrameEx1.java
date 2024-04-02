package am;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameEx1 extends JFrame {
	
	// 멤버변수 선언!!!
	MyWinAdpt myWAd; // WindowListner를 구현한 객체
	JButton btn1, btn2, btn3, btn4, btn5; // 버튼 변수
	
	public MyFrameEx1() {
		// 생성자의 목적: 멤버변수들에 대한 초기화
		
		// 원하는 버튼 객체 생성
		btn1 = new JButton(BorderLayout.NORTH);	// < 해당 생성자는 5가지가 있는데, 이는 여러 방법으로 생성할 수 있음을 뜻한다.
		btn2 = new JButton(BorderLayout.SOUTH);	// < 이게 버튼 하나다. 버튼을 만들었다. 다만, 프레임에는 두지않았기에 나오지는 않는다.
		btn3 = new JButton(BorderLayout.WEST);
		btn4 = new JButton(BorderLayout.EAST);
		btn5 = new JButton(BorderLayout.CENTER);
		
//		btn1.setSize(100, 50);
//		btn1.setLocation(100, 50);
//		btn2.setSize(100, 150);
//		btn2.setLocation(300, 150);
		
		
		// 현재 창에 생성한 버튼 객체를 배치(추가)하기
		this.add(btn1, BorderLayout.NORTH); 	// 대부분의 상수는 하나만 만들어져도 괜찮기에 여러개 만들 필요가 없으므로
		// 문자열 "North"도 가능하지만			// 보통 static finale로 지정한다.
		// 그럴 경우, 새로운 객체를 생성해야하기에 프로그램 수행 효율 및 시간을 최적화시키고자 이미 선언된 상수를 사용함.
		
		this.add(btn2, BorderLayout.SOUTH); 	// layout으로 인해서 먼저 생성된 btn1이 덮어씌어진다?
												//										겹쳐진다?
												//										지워진다?
		
		this.add(btn3, BorderLayout.WEST);
		this.add(btn4, BorderLayout.EAST);
		this.add(btn5, BorderLayout.CENTER);
		
		// 5개의 영역 당 하나의 객체만 넣을 수 있다.
		// 그래서, 나무판자(JPanel)를 만들어서 버튼을 거기에
		
		
		
		this.setSize(500, 600);
		this.setLocation(350, 150);
		this.setTitle("My Frame V 0.4");
		
		this.setVisible(true);
		
		// 종료이벤트 감지자 등록
		myWAd = new MyWinAdpt();
		this.addWindowListener(myWAd);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// 프로그램 시작

		new MyFrameEx1();

	}

}
