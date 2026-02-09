package d260209_03;

import java.io.Serializable;

public class Point implements Serializable{

	//직렬 전송 시 반드시 필요
	private static final long serialVersionUID = 1L;
	
	public int x;
	public int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
