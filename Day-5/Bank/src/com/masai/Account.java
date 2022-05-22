package com.masai;

public class Account {
	private  int accountId;
	private  String accountType;
	private  int balance;
	
	public boolean withdraw(int withdraw) {
		if(balance>=withdraw) {
			this.balance=balance-withdraw;
			return true;
		}else {
			return false;
		}
		
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}

}
