package d260202_01;

public class TestMain {

	public static void main(String[] args) {
		PhonebookDAO dao=new H2PhonebookDAO();
		//전체 삭제
		//System.out.println(dao.delete());
		//입력
		
		//dao.insert(new Phonebook(1, "홍길동","010-1111-1111","hong@gmail.com"));
		//dao.insert(new Phonebook(2, "홍길동2","010-1111-2222","hong@gmail.com"));
		//dao.insert(new Phonebook(3, "홍길동3","010-1111-3333","hong@gmail.com"));
		//System.out.println(dao.findAll());
		
		//수정
		//System.out.println(dao.findById(2));
		//dao.update(new Phonebook(2, null, "010-1234-5678", null));
		//삭제
		//dao.delete(2);
		
		
		
		
		//선택출력
		//System.out.println(dao.findById(2));
		
		//전체 출력
		//System.out.println(dao.findAll());
		
		System.out.println(dao.count());
	}

}
