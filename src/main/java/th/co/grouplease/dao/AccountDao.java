package th.co.grouplease.dao;

import th.co.grouplease.Account;

public interface AccountDao extends Dao<Account> {
	
	void create(Account account, String password);
	
	Account findByUsername(String username);
}