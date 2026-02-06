package d260202_03;

public class AccountBookManager {
	
	AccountBook5 dao;
	
	public AccountBookManager() {
		
	}
	
	public AccountBookManager(AccountBook5 dao) {
		this.dao=dao;
	}
	
	public void delete(int id) {
		dao.delete(id);
	}

	public boolean isExist(int id) {
		if(dao.findById(id)==null) {
			return false;
		}
		return true;
	}
	
}
