package d260128;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame2Listener implements WindowListener,ActionListener{

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

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("버튼을 클릭!!");
		//System.out.println(e.getActionCommand());
		//System.out.println(e.getID());
		//System.out.println(e.getSource());
		Object src=e.getSource();
		Button b=(Button) src;
		System.out.println(b.getX());
		
		switch(e.getActionCommand()) {
		case "입력메뉴": System.out.println("입력메뉴실행!!");break;
		case "전체출력 메뉴": System.out.println("전체출력 메뉴!!");break;
		case "찾기출력 메뉴": System.out.println("찾기출력 메뉴!!");break;
		case "수정 메뉴": System.out.println("수정 메뉴!!");break;
		case "삭제 메뉴": System.out.println("삭제 메뉴!!");break;
		case "입력": System.out.println("입력!!");break;
		default : break;
		}
		
		
	}

}