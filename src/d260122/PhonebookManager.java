package d260122;

public class PhonebookManager {
	private Phonebook[] pb=new Phonebook[100];
	private int index=0;
	public void insert(String name, String hp, String email) {
//		pb[0]=new Phonebook(name, hp, email);
		pb[index]=new Phonebook(index+1,name, hp, email);
		index++;
	}
	
	public void select() {
		/*
		for(Phonebook p:pb) {
			System.out.println(p);
		}
		*/
		
		/*
		//null처리를 위한 코드 수정
		for(int i=0;i<index;i++) {
			System.out.println(pb[i]);
		}
		*/
		
		//id=0으로 삭제된 코드는 출력되지 않게 처리
		for(int i=0;i<index;i++) {
			if(pb[i].getId()!=0) {
				System.out.println(pb[i]);
			}
		}
	}

	public void update(String searchname, Phonebook p) {
//		for(int i=0;i<index;i++) {
//			if(searchname.equals(pb[i].getName())) {
//				pb[0].setName(p.getName());
//				pb[0].setHp(p.getHp());
//				pb[0].setEmail(p.getEmail());
//				break;
//			}
//		}
		//위의 코드의 문제점
		//수정하는 값에서 전화번호만 있고 나머지 값이 존재하지 않는 경우(null)
		//이름과 이메일이 null로 변경되어 데이터 왜곡이 발생
//		이를 해결하기 위해 null값은 수정을 하지 않게 처리
//		추가사항)break는 for문을 빠져나가지만 return은 함수를 종료
		for(int i=0;i<index;i++) {
			if(searchname.equals(pb[i].getName())) {
				if(p.getName()!=null) {
					pb[i].setName(p.getName());
				}
				if(p.getHp()!=null) {
					pb[i].setHp(p.getHp());
				}
				if(p.getEmail()!=null) {
					pb[i].setEmail(p.getEmail());
				}
				
				return;
			}
		}
		
	}
	
	public void delete(String name) {
		for(int i=0;i<index;i++) {
			if(pb[i].getName().equals(name)) {
				pb[i].setId(0); //id가 0이면 삭제
				//위의 코드로 인해서 파생되는 수정코드는
				//전체출력일 때 id가 0인 것은 출력을 하지 않도록 처리
			}
		}
	}
	
	//찾기-select에서 파생되어서 만들어지는 함수
	public void selectByName(String name) {
		/*
		for(int i=0;i<index;i++) {
			if(pb[i].getName().equals(name)) {
				System.out.println(pb[i]);
				break;
			}
		}
		*/
		//삭제된 이름을 검색할 때 삭제된 이름의 배열이 출력되는 문제 발생
		
		for(int i=0;i<index;i++) {
			if(pb[i].getName().equals(name) && pb[i].getId()!=0) {
				System.out.println(pb[i]);
				break;
			}
		}
	}
}
