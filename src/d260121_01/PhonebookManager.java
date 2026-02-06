package d260121_01;

public class PhonebookManager {
	//1개의 객체를 100개 관리하는 객체임
	Phonebook[] pb=new Phonebook[100];
	int index=0;
	
	//관리하기 위한 기능(입력, 출력, 수정, 삭제)
	public void insert(String name, String hp, String email) {
		pb[index]=new Phonebook(name, hp, email);
		index=index+1;
	}
	public void select() {
		//100개의 배열에 null값이 존재하면 오류 발생
		/*
		for(Phonebook p:pb) {
			System.out.println(p);
		}
		*/
		for(int i=0;i<index;i++) {
			System.out.println(pb[i]);
		}
	}
	public void update() {
		
	}
	public void delete() {
		
	}

}
