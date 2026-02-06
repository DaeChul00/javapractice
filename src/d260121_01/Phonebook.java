package d260121_01;

public class Phonebook {

	//속성을 직접 접근하지 못하게 하기위해서는 private키워드 사용
	private String name;
	private String hp;
	private String email;
	
	//생성자함수, get함수, set함수, toString함수 생성
	//기본생성자
	public Phonebook() {} 
	//필드생성자
	public Phonebook(String name, String hp, String email) {
		this.name=name;
		this.hp=hp;
		this.email=email;
	}
	
	//한 개의 값을 가지고 오는 함수인 get함수 작성
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public String getEmail() {
		return email;
	}
	
	//set함수
	public void setName(String name) {
		this.name=name;
	}
	public void setHp(String hp) {
		this.hp=hp;
	}public void setEmail(String email) {
		this.email=email;
	}
	
	//toString 재정의
	@Override
	public String toString() {
		return "Phonebook[name="+name+",hp="+hp+",email="+email+"]";
	}
	
}
