package com.insync.springcore.service.impl;

//To Support @Autowired
import org.springframework.beans.factory.annotation.Autowired;
//To support @Service annotation
import org.springframework.stereotype.Service;

import com.insync.springcore.beans.Account;
import com.insync.springcore.dao.AccountDao;
import com.insync.springcore.service.AccountService;

//SERVICE LAYER

/*
 * AccountServiceImpl has a dependency to the AccountDao interface, which declares methods 
 * to perform basic persistence operations on a given Account, and finder methods to find 
 * Account instances using some query parameters.
 */
@Service
public class AccountServiceAnnotationImpl implements AccountService {
	private AccountDao accountDao;

	@Autowired
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		//look up the accounts based on the sourceAccountId and targetAccountId passed as parameters.
		Account sourceAccount = accountDao.find(sourceAccountId);
		Account targetAccount = accountDao.find(targetAccountId);
		sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		targetAccount.setBalance(targetAccount.getBalance() + amount);
		accountDao.update(sourceAccount);
		accountDao.update(targetAccount);
	}

	@Override
	public void depositMoney(long accountId, double amount) throws Exception {
		Account account = accountDao.find(accountId);
		account.setBalance(account.getBalance() + amount);
		accountDao.update(account);
	}

	@Override
	public Account getAccount(long accountId) {
		return accountDao.find(accountId);
	}	

}

/* DEPENDENT CLASS LIST
 * com.insync.springcore.beans.Account
 * com.insync.springcore.dao.AccountDao
 * com.insync.springcore.dao.impl.AccountDaoImpl
 * com.insync.springcore.service.AccountService
 * com.insync.springcore.service.impl.AccountServiceImpl
 * com.insync.springcore.config.AccountBeanConfiguration
 * com.insync.springcore.AccountDemo
 * 
 */




