package d260128;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Main8 {

	public static void main(String[] args) {
		DialogFrame f=new DialogFrame();
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.getButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.getDialog().setVisible(true);				
			}
		});
		
		//다이얼로그 윈도우 닫기 처리
		f.getDialog().addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				f.getDialog().setVisible(false);
			}
		});
	}

}

class DialogFrame extends Frame{
	private Button button;
	private TextField text;
	private Dialog dialog;
	
	public DialogFrame() {
		setBounds(0,0,300,300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		button=new Button("다이얼로그 실행");
		add(button);		
		
		text=new TextField();
		add(text);
		
		//다이얼로그 상자를 띄워주면 됨
		//3번쨰 입력값 모달여부
		dialog=new Dialog(this,"다이얼로그", true);
		dialog.setBounds(100,100,300,300);
		dialog.setVisible(false);
		
	}

	public Button getButton() {
		return button;
	}
	
	public Dialog getDialog() {
		return dialog;
	}
}
