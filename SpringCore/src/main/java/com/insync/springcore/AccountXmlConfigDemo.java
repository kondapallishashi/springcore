package com.insync.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.springcore.service.AccountService;
public class AccountXmlConfigDemo {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("account-beans.xml");
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
