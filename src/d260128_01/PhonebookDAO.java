package d260128_01;

import java.util.List;

public interface PhonebookDAO {

	public void insert(int id, String name, String hp, String email);
	//findAll함수는 입력값이 없고 전체리스트 데이터를 반환합니다. 데이터가 없을 경우 null
	public List<Phonebook> findAll();
	public Phonebook findById(int id);
	public int updateById(Phonebook p);
	public int delete(int id);
}
