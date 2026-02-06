package d260128_01;

import java.util.List;

public class PhonebookDAOv2 implements PhonebookDAO {

	@Override
	public void insert(int id, String name, String hp, String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Phonebook> findAll() {
		System.out.println("버전 2에 대한 전체 리스트를 출력합니다.");
		return null;
	}

	@Override
	public Phonebook findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateById(Phonebook p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
