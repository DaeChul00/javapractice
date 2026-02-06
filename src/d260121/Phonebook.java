package d260121;

public class Phonebook {
	
//	변수 = 속성
	String name;
	String hp;
	String email;
//	함수=기능
	public void print() {
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + hp);
		System.out.println("이메일:" + email);
	}
	
//	결론: 클래스=객체
//	클래스는 변수와 함수로 구성
//	객체는 속성과 기능으로 구성
	public void myprint(String name, String hp, String email) {
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + hp);
		System.out.println("이메일:" + email);
	}
	
	//생성자 함수는 클래스명과 동일한 함수이며 리턴이 존재하지 않음
	public Phonebook() {
		
	}
}
