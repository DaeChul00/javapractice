package d260126_03;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

import java.awt.*;

public class PhonebookFrame2 extends Frame{
	
	public PhonebookFrame2() {
		setBounds(0, 0, 500, 200);
		setVisible(true);
		setTitle("전화번호부");
		setLayout(new GridLayout(2,1));//frame의 레이아웃
		Panel panel1=new Panel();
		panel1.setBackground(Color.BLUE);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		Panel panel2=new Panel();
		panel2.setBackground(Color.YELLOW);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		//panel1.add(new Button("버튼1"));
		//panel1.add(new Button("버튼2"));
		//panel1.add(new Button("버튼3"));
		add(panel1);
		add(panel2);
		panel2.setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	
}
