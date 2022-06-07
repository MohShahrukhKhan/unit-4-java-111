package com.masai;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
     Amount account =new Amount();
     try {
    	 System.out.println("Enter Account Number");
    	 int accountNum=sc.nextInt();
    	 account.accountNumber=accountNum;
    	  System.out.println("Enter Deposit Amount");
    	  double amount=sc.nextDouble();
    	  account.deposit(amount);
    	     
    	  System.out.println("Enter Withdraw Amount");
    	  double withdraw=sc.nextDouble();
    	     System.out.println(account.Balance);
    	     System.out.println("after Withdraw  Balance "+""+account.withdraw(withdraw));
    	     
     }catch(InsufficientFundsException ife) {
    	 System.out.println(ife.getMessage());
     }
   
     
	}

}
