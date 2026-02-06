package d260129;
//개발자가 구현->CarFunc에 설계(기획)된 내용으로 구현
//기능을 구현할 때 입력값(파라메다)이 필요하고 기능에 대한 결과도 필요
//기능에 대한 결과(리턴값)도 필요
public class 자동차기능구현 implements CarFunc{

	@Override
	public void movehandle() {
		System.out.println("핸들을 조작합니다.!!");
		
	}

	@Override
	public void controllerAcc() {
		System.out.println("엑셀을 조작합니다.!!");
		
	}

	@Override
	public void controllerBreak() {
		System.out.println("브레이크를 조작합니다.!!");
		
	}

	@Override
	public void controllerWindow() {
		System.out.println("창문을 조작합니다.!!");
		
	}

}
