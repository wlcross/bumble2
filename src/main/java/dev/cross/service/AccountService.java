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
		String pass = new String(scramblePass(l.getPassword().toCharArray(), l.getPassword().length()));
		Integer value = accountDao.login(l.getUsername(), pass);
		if (value == null) return -1;
		return value;
	}
	
	public int createAccount(Account a) {
		a.setPassword(new String(scramblePass(a.getPassword().toCharArray(), a.getPassword().length())));
		//System.out.println(a);
		return accountDao.save(a).getId();
	}
	
	public void updateBasicAccountInfo(BasicInfo b) {
		accountDao.basicAccountInfoSetup(b.getUid(), b.getfName(), b.getlName(), b.getCity(), b.isM(), b.isLfm(), b.isLff());
	}
	
	
	//I know this doesn't actually do much, just scrambling it for fun
	public char[] scramblePass(char[] s, int end) {
		for (int i = 1; i < end; i ++) {
			scramblePass(s, i);
			if (s[i] <= 'z' && s[i] >= 'a') {
				s[i] += 11;
				if (s[i] * 7 % 10 == 0) {
					s[i] -= 4;
				}
				if (s[i] > 'z') s[i] -= 26;
			}
			else if (s[i] <= 'Z' && s[i] >= 'A') {
				s[i] += 7;
				if (s[i] * 4 % 10 == 0) {
					s[i] -= 3;
				}
				if (s[i] > 'Z') s[i] -= 26;
			} else if (s[i] <= '9' && s[i] >= '0') {
				s[i] += 2;
				if (s[i] * 2 % 10 == 0) {
					s[i] -= 1;
				}
				if (s[i] > '9') s[i] -= 10;
			}
		}
		return s;
	}
}
