package d260128;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Main3{

	public static void main(String[] args) {
		MyFrame2 f=new MyFrame2();
		//window 리스너 추가
		//리스너만 처리하는 클래스 만들고 처리
 
		MyFrame2Listener li=new MyFrame2Listener();
		f.addWindowListener(li);
		
		//버턴에 대한 리스너를 처리(버턴에 대한 정보) //Action은 버튼을 클릭했을 때를 의미
		//f.getButton()[0].addActionListener(li);
		
		//5개의 버튼을 등록
		for(Button button:f.getButton()) {
			button.addActionListener(li);
		}
		
	}

}

class MyFrame2 extends Frame{
	private Button[] button;
	private String[] btnslb={"입력메뉴","전체출력 메뉴","찾기출력 메뉴","수정 메뉴","삭제 메뉴","입력"};
	//private는 get,set함수로 가져오고 설정가능하지만, 객체를 변화시킬 일이 없을 경우 get함수
	public Button[] getButton() {return button;}
	public String[] getBtnslb() {return btnslb;}


	public MyFrame2() {
		setBounds(0,0,500,700);
		setVisible(true);
		setLayout(new FlowLayout());
		
		button=new Button[btnslb.length];
		for(int i=0;i<button.length;i++) {
			button[i]=new Button(btnslb[i]);
			add(button[i]);
		}
		
		revalidate();repaint();
		
	}
}