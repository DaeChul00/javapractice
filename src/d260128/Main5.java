package d260128;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main5 {

	public static void main(String[] args) {
		MouseFrame f=new MouseFrame();
		f.addWindowListener(f);
		f.addMouseListener(f);
		f.addMouseMotionListener(f);
		f.addMouseWheelListener(f);

	}
	

}

class MouseFrame extends Frame 
implements WindowListener, MouseListener, MouseMotionListener, MouseWheelListener{
	private int sx=0;
	private int sy=0;
	private int ex=0;
	private int ey=0;
	
	public MouseFrame() {
		setBounds(0,0,1000,1000);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		//선그리기 (x1, y1, x2, y2)
		g.drawLine(sx, sy, ex, ey);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("click=>x:"+e.getX()+", y:"+e.getY());
		
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println("move=>x:"+e.getX()+", y:"+e.getY());
		sx=ex;sy=ey;
		ex=e.getX();
		ey=e.getY();
		repaint();
		
	}
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		//System.out.println("Pressed=>x:"+e.getX()+", y:"+e.getY());
		//repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
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