package com.insync.springcore.service;

import com.insync.springcore.beans.Account;

//SERVICE LAYER
public interface AccountService {
	
	//Define a method transferMoney() that takes the accountId of source and destination accounts
	//and the amount to be transferred.
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount);
	
	public void depositMoney(long accountId, double amount) throws Exception;
	
	public Account getAccount(long accountId);
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


