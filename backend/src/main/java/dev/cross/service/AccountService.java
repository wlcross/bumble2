package dev.cross.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.cross.model.Account;
import dev.cross.model.BasicInfo;
import dev.cross.model.Login;
import dev.cross.repository.AccountDAO;

@Service
public class AccountService {

	private final AccountDAO accountDao;
	
	@Autowired
	public AccountService(AccountDAO accountDao) {
		this.accountDao = accountDao;
	}
	
	public int login(Login l) {
		Integer value = accountDao.login(l.getUsername(), l.getPassword());
		if (value == null) return -1;
		return value;
	}
	
	public int createAccount(Account a) {
		return accountDao.save(a).getId();
	}
	
	public void updateBasicAccountInfo(BasicInfo b) {
		accountDao.basicAccountInfoSetup(b.getUid(), b.getfName(), b.getlName(), b.getCity(), b.isM(), b.isLfm(), b.isLff());
	}
}
