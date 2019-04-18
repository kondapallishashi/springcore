package com.insync.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.springcore.service.AccountService;

public class AccountJavaAnnotationConfigDemo {
	
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/insync/springcore/account-annotation-beans.xml");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("account-annotation-beans.xml");
		AccountService accountService = applicationContext.getBean("accountServiceAnnotationImpl", AccountService.class);

		System.out.println("Before money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());		
		
		accountService.transferMoney(1, 2, 5.0);
		
		System.out.println("After money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());

	}

}
