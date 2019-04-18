package com.insync.springcore.dao;

import java.util.List;
//Import Account so that the bean class is accessible in AccountDao Interface. 
import com.insync.springcore.beans.Account;

//This is part of DAO layer.

public interface AccountDao {
	//Define Abstract methods to insert Account.
	public void insert(Account account);
    public void update(Account account);
    public void update(List<Account> accounts);
    public void delete(long accountId);
    public Account find(long accountId);
    public List<Account> find(List<Long> accountIds);
    public List<Account> find(String ownerName);
    public List<Account> find(boolean locked);
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


