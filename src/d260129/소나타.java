package d260129;

public class 소나타 {
	CarFunc 기능;
	
	//생성자는 기본적으로 입력되는 값을 디폴트로 가지기 때문에 고정값이 되므로 유연하지 않다.
	public 소나타() {
		//기능=new 자동차기능구현();
	}
	
	public 소나타(자동차기능구현 구현) {
		기능=구현;
	}

	public CarFunc get기능() {
		return 기능;
	}

	public void set기능(CarFunc 기능) {
		this.기능 = 기능;
	}
	
}
