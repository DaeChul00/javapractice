package d260128;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//리스너 정리
//Frame -> Window 리스너를 소유하고 있다
//Button등은 부품은 각 부품별 리스너를 모두 소유하고 있다.
//결론:객체마다 리스너(이벤트등록)가 존재한다.
//이벤트:클릭할 때, 마우스관련, 키보드관련
//window리스너 등록하는 방법
//1)자신의 객체내에 직접 선언하는 방법
//2)자신의 객체내에 함수를 만들어서 처리
//3)별도의 클래스를 만들어서 처리하는 방법
public class Main2 {

	public static void main(String[] args) {
		MyFrame f=new MyFrame();
		
		//1)자신의 객체내에 직접 선언하는 방법=익명 내부 클래스 (Anonymous Inner Class)
		//어댑터를 사용하면 특정한 함수만을 추출하여 구현 가능(추상클래스 처리)
		/*
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		*/
		//리스너를 사용하면 모든 구현함수를 구현해야함(인터페이스처리)
		/*
		f.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		*/
		
		//2)구현한 프레임내에 리스너를 추가
		//f.addWindowListener(f);
		//f.addWindowListener(this); //->Main2클래스에 implements WindowListener 구현
		
		//3)별도의 클래스를 만들어서 리스너를 모두 처리하는 방법
		f.addWindowListener(new MyLinstener());
		
	}

}

//2)구현한 프레임내에 리스너를 등록하는 것(implements)
class MyFrame extends Frame implements WindowListener{
	public MyFrame() {
		setTitle("리스너 등록");
		setBounds(0,0,500,700);
		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
	System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}