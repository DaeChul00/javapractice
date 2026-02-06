package d260127;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListBoxMain2 {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setBounds(0, 0, 300, 500);
		f.setTitle("list box");
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);				
			}
		});
		//레이아웃설정
		f.setLayout(new BorderLayout());
		Label label=new Label("아이디 이름 전화번호");
		label.setBackground(Color.LIGHT_GRAY);
		label.setAlignment(Label.LEFT);
		f.add(label, BorderLayout.NORTH);
		
		java.awt.List list=new List();		
		list.add("1 홍길동 010-1111-1111");
		list.add("2 김길동 010-1111-2222");
		list.add("3 여길동 010-1111-3333");
		f.add(list, BorderLayout.CENTER);
		
		Label idlb=new Label("아이디:"); 
		idlb.setBackground(Color.ORANGE);
		Label namelb=new Label("이름:"); 
		namelb.setBackground(Color.YELLOW);
		Label hplb=new Label("전화번호:"); 
		hplb.setBackground(Color.CYAN);
		idlb.setPreferredSize(new Dimension(200, 30));
		namelb.setPreferredSize(new Dimension(200, 30));
		hplb.setPreferredSize(new Dimension(200, 30));
		
		Panel panel=new Panel();
		panel.setLayout(new FlowLayout());
		panel.add(idlb);
		panel.add(namelb);
		panel.add(hplb);
		f.add(panel, BorderLayout.SOUTH);
		f.pack();
		//f.invalidate();f.repaint();
		
		/*
		f.add(idlb, BorderLayout.SOUTH);
		f.add(namelb, BorderLayout.SOUTH);
		f.add(hplb, BorderLayout.SOUTH);
		*/
		
		//아이템에 클릭을 했을 때 처리를 하기 위해서는 리스너 등록
		list.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(list.getItem((int) e.getItem()));
				System.out.println(list.getSelectedItem());
				System.out.println(list.getSelectedItem().split(" ")[0]);
				System.out.println(list.getSelectedItem().split(" ")[1]);
				System.out.println(list.getSelectedItem().split(" ")[2]);
				String[] datas=list.getSelectedItem().split(" ");
				idlb.setText("아이디:"+datas[0]);
				namelb.setText("이름:"+datas[1]);
				hplb.setText("전화번호:"+datas[2]);
			}
		});
	}

}
