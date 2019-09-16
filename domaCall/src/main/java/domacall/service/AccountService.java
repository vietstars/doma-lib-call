package domacall.service;

import org.springframework.stereotype.Service;

import domalib.dao.AccountDao;
import domalib.dao.AccountDaoImpl;
import domalib.entity.AccountEntity;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AccountService {
	
	@Autowired
 	AccountDao accountDao;
//	public List<Account> selectAll() {
//		return accountDao.selectAll();
//	}
//
//	public Account findByEmail(String email) {
//		return accountDao.findByEmail(email);
//	}
//
//	public boolean newAccount(Account account) {
//		boolean created = false;
//		try{
//		 	int result = accountDao.newAccount(account);
//		 	created = result == 1;
//		}catch(Exception e){
//	      	System.out.println("INSERT FAILS: "+ account.getEmail());
//	  	}finally {
//			return created;
//	    }
//	}
	 

	public AccountEntity findOne(Long id) {		
		return accountDao.findOne(id);		
	}

//	public void toggleBan(Integer id) {
//		Account account = accountDao.findOne(id);
//		account.setStatus(account.getStatus()==1?0:1);	
//	 	accountDao.toggleBan(account);
//	}
//
//	public boolean delAccount(Integer id) {
//		int result = accountDao.delAccount(id);
//	 	return result == 1;
//	}

}
