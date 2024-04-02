package am;

import java.awt.Color;

import javax.swing.JFrame;

public class BfTest extends JFrame { 	// 재정의는 상속관계에 있는 서로 다른 클래스끼리
										// 부모클래스의 메소드를 자식클래스에서 다시 정의하는 것이며
										// 부모클래스의 메소드는 숨김 처리(Hidden)가 되고
										// 우선순위가 자식클래스에서 재정의한 메소드로 주어진다.
	
	BfTestWL btWL;
	
	public BfTest() {
		this.setSize(500, 600);
		this.setLocation(500, 150);
		this.setTitle("My Frame Test 2");
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
				
		btWL = new BfTestWL();
		
		this.addWindowListener(btWL);	// WindowListener를 구현한 객체(의 주소) < 중요하다.
									 	//											ㄴWindowListener는 인터페이스이므로 인자로 사용이 어려움
										//												ㄴ다만, 사용범위는 인자의 자료형인 WindowListener로 제한
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		new BfTest();

	}

}
