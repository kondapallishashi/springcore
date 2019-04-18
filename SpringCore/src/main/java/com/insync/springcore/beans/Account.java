package com.insync.springcore.beans;
//To Support Date accessTime.
import java.util.Date;

//This class is part of Java Based Configuration for creating Spring 

//Define domain class Account.
public class Account {
    private long id;
    private String ownerName;
    private double balance;
    private Date accessTime;
    private boolean locked;
    
    //Getter & Setter Methods.
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getAccessTime() {
		return accessTime;
	}
	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
    
    //getters & setters...
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


