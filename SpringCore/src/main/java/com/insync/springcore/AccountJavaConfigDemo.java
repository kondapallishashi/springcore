package com.insync.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.insync.springcore.config.AccountBeanConfiguration;
import com.insync.springcore.service.AccountService;

public class AccountJavaConfigDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AccountBeanConfiguration.class);
		AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

		System.out.println("Before money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());		
		
		accountService.transferMoney(1, 2, 5.0);
		
		System.out.println("After money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
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


