package d260128;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class Main1 {

	public static void main(String[] args) {
		//awt에서 Frame 부품정리
		//TextField, Label, Button, List,
		//TextArea
		//Checkbox(체크상자/여러개 선택)
		//CheckboxGroup(라디오버튼/여러개중 한개 선택)
		//Choice(선택상자/여러개 또는 한개 선택 가능)
		//Scrollbar
		//gpt:java.awt Frame에서 사용가능한 부품 정리
		
		Frame f=new Frame();
		f.setTitle("부품만들기");
		//f.setBackground(Color.LIGHT_GRAY);
		f.setBounds(0,0,500,700);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
				
		TextArea tbox=new TextArea(10, 30);
		f.add(tbox);
		tbox.setText("초기값");
		System.out.println(tbox.getText());
		
		Checkbox cb1 = new Checkbox("사과");
		Checkbox cb2 = new Checkbox("바나나", true); // 기본 선택
		f.add(cb1);f.add(cb2);
		System.out.println(cb1.getState());
		System.out.println(cb2.getState());
		System.out.println(cb2.getLabel());
		System.out.println(cb2.getName());
		
		CheckboxGroup gen = new CheckboxGroup();
		Checkbox male   = new Checkbox("남자", gen, true);
		Checkbox female = new Checkbox("여자", gen, false);
		f.add(male);f.add(female);
		System.out.println(gen.getSelectedCheckbox());
		System.out.println(gen.getSelectedCheckbox().getLabel());
		
		//choice는 다중선택 불가(다중 선택시 list로 사용)
		Choice choice = new Choice();
		choice.add("java");
		choice.add("파이썬");
		choice.add("html");
		f.add(choice);
		
		System.out.println(choice.getSelectedIndex());
		System.out.println(choice.getSelectedItem());;
		System.out.println(choice.getSelectedObjects());
		
		f.revalidate();
		f.repaint();
		

	}

}