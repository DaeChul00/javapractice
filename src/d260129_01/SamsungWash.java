package d260129_01;

public class SamsungWash implements WashFunc {
	private int speed;
	@Override
	public void startButton() {
		System.out.println("삼성세탁기 시작");
		
	}

	@Override
	public void stopButton() {
		System.out.println("삼성세탁기 중지");
		
	}

	@Override
	public void pauseButton() {
		System.out.println("삼성세탁기 정지");
		
	}

	@Override
	public void changeButton(int speed) {
		if(!(speed>=0 && speed<=100)) {
			this.speed=0;
		}
		this.speed=speed;
		System.out.println(speed+"으로 속도변경");
	}
	
	public void clean() {
		System.out.println("삼성세탁기 클린 기능 동작");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
