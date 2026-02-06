package d260128;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;



public class Main5_2 {
	public static void main(String[] args) throws AWTException {
		//로봇은 시스템을 제어하는 객체(전역프로그램 제어 가능)
		Robot robot=new Robot();
		/*
		for(int x=100; x<500;x++) {
			robot.mouseMove(x, 300);
			robot.delay(10);
		}
		*/
		robot.mouseMove(20, 300);
		//robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		
		//더블클릭(mouse누르고 떼고를 2번 반복)
		for(int i=0;i<2;i++) {
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(100);
		}
	}

}

class MouseFrame3 extends Frame{
	private int prex=-1;
	private int prey=-1;
	private int x;
	private int y;
	
	public MouseFrame3() {
		setBounds(0,0,1000,1000);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.drawLine(prex, prey, x, y);
		prex=x;
		prey=y;
	}
	
	
}