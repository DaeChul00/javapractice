package d260122_01;

public class Test {
	public static void main(String[] args) {
		
	int a=10;
	int b=a;
	Phonebook p1=new Phonebook();
	System.out.println(p1.hashCode());
	Phonebook p2=new Phonebook();
	System.out.println(p2.hashCode());
	p1=p2;
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());
	
	Phonebook p3=new Phonebook("hong", "010-1111-1111","hong@gmail.com");
	
	Phonebook p4=p3;
	System.out.println(p4);
	p3.setName("Kim");
	System.out.println(p4);
	
	a=100;
	System.out.println(a);
	System.out.println(b);
	
	PhonebookManager pm=new PhonebookManager();
	//함수를 통해서 가져오는 객체의 hashcode
	System.out.println(pm.getPhonebookByName("홍길동").hashCode());
	}
}
