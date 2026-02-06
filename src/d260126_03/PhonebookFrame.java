package d260126_03;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PhonebookFrame extends Frame implements WindowListener{
	
	public PhonebookFrame() {
		setBounds(0, 0, 500, 1000);
		setVisible(true);
		setTitle("전화번호부");
		setLayout(new CardLayout());
		
		CardLayout mainlayout =new CardLayout();
		Panel mainpanel=new Panel();
		add(mainpanel);
		mainpanel.setBackground(Color.BLACK);
		
		//전화번호부 입력 판넬(부품을 만들고 상위 부품에 추가)
		Panel insertPanel=new Panel();
		insertPanel.setLayout(new CardLayout());
		mainpanel.add(insertPanel, "insertPanel");
		insertPanel.setBackground(Color.YELLOW);
		
		//전화번호부 출력 판넬
		Panel allPrintPanel=new Panel();
		allPrintPanel.setLayout(new CardLayout());
		mainpanel.add(allPrintPanel, "allPrintPanel");
		allPrintPanel.setBackground(Color.ORANGE);
		
		//찾기, 수정, 삭제
		Panel viewPanel=new Panel();
		viewPanel.setLayout(new CardLayout());
		mainpanel.add(viewPanel, "viewPanel");
		viewPanel.setBackground(Color.BLUE);
		
		//mainPanel에 버튼 부품을 추가하기
		Button insertbtn=new Button("입력버튼");
		mainpanel.add(insertbtn);
		insertbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼이 눌러졌을 때 카드를 변경
				System.out.println("입력버튼 클릭");
				mainlayout.show(mainpanel, "insertPanel");
			}
		});
		
		//setLayout(new GridLayout(5, 1, 10, 5));//간격추가
		
		for(int i=0;i<10;i++) {
			add(new Button("버튼"+1));
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
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
