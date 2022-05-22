package com.masai;

import java.util.Scanner;

public class AccountDetails {
	static Account obj=new Account();
	 Scanner input=new Scanner(System.in);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails acounD=new AccountDetails();
		acounD.getAccountDetails();
		int withd= acounD.getWithdrawAmount();
	
		if(	obj.withdraw(withd)) {
			System.out.println("Balance amount after withdraw:"+" "+	obj.getBalance());
			
		}else {
			System.out.println("Sorry!!! No enough balance");
		}
	
		
       
	}
	
	public Account getAccountDetails() {
		System.out.println("Enter account id:");
		int number=input.nextInt();
		
		obj.setAccountId(number);
		System.out.println("Enter account type:");
		String saving=input.next();
		obj.setAccountType(saving);
		System.out.println("Enter balance:");
		int balance=input.nextInt();
		while(true) {
		if(balance<=0) {
			System.out.println("Balance should be positive");
			balance=input.nextInt();
		}else {
			obj.setBalance(balance);
			break;
		}
		}
		
      return obj;
   
	}
	public int getWithdrawAmount() {
		System.out.println("Enter amount to be withdrawn:");
		int withdrawn=input.nextInt();
		if(withdrawn<=0) {
			getWithdrawAmount();
		}
			return withdrawn;
		
		
	}
}
