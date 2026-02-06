package d260122;

public class Test {
	/*
	@org.junit.Test
	public void test() {
		PhonebookManager pm= new PhonebookManager();
		pm.insert("홍길동", "010-1111-1111", "hong@gmail.com");
		pm.insert("김길동", "010-1111-2222", "kim@gmail.com");
		pm.select();
	}
	*/
	public static void main(String[] args) {
		PhonebookManager pm= new PhonebookManager();
		pm.insert("홍길동", "010-1111-1111", "hong@gmail.com");
		pm.insert("김길동", "010-1111-2222", "kim@gmail.com");
		pm.insert("유길동", "010-1111-3333", "ryu@gmail.com");
//		pm.update("김길동", new Phonebook(null, "010-1111-3333", null));
//		Phonebook updatepb=new Phonebook(null, "010-1111-3333", null);
//		pm.update("김길동", updatepb);
		pm.delete("김길동");
		pm.insert("김길동", "010-1111-4444", "kim@gmail.com");
//		pm.select();
		pm.selectByName("김길동");
	}
}
