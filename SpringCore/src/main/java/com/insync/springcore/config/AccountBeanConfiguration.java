package com.insync.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.insync.springcore.dao.AccountDao;
import com.insync.springcore.dao.impl.AccountDaoInMemoryImpl;
import com.insync.springcore.service.AccountService;
import com.insync.springcore.service.impl.AccountServiceImpl;


/*
 * The @Configuration annotation tells Spring that this class contains configuration metadata 
 * as well as itself as a bean. Within the configuration class, two factory methods are created 
 * marked with the org.springframework.context.annotation.Bean annotation. 
 * Those methods are called by the Spring Container during bootstrap, and their returning
 * values are treated as Spring‐managed beans. The method name is accepted as the bean name 
 * by default. Within a factory method, you created a bean using its concrete class and returned 
 * it after setting its necessary dependencies by calling its setter methods. 
 * Dependencies can also be given as constructor arguments.
 */

//Indicates that this class contains configuration metadata
@Configuration
public class AccountBeanConfiguration {

	//@Bean is used to create factory method that returns the AccountService bean.
	//AccountService is an interface that is implemented by AccountServiceImpl concrete class. This is 
	//used to ensure that the class keeps working inspite of changes in the concrete classes.
	//
	@Bean
	public AccountService accountService() {
		AccountServiceImpl bean = new AccountServiceImpl();
		//accountDao() calls the below defined factory method.
		bean.setAccountDao(accountDao());
		return bean;
	}
	//@Bean is used to create factory method that returns AccountDao bean.
	//AccountDao is an interface that is implemented by AccountDaoInMemory concrete class.
	@Bean
	public AccountDao accountDao() {
		AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
		//dependencies of accountDao bean will be injected here...
		return bean;
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


