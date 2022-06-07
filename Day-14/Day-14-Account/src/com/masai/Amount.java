package com.masai;

public class Amount {
	int accountNumber;
    double Balance;
    
    void deposit(double amount) {
    	this.Balance=amount;
    	
    }
    double withdraw(double amount) throws InsufficientFundsException{
    	if(amount<=Balance) {
    	double	WithDraw=Balance-amount;
    	this.Balance=WithDraw;
    	return WithDraw;
    	}else {
    		InsufficientFundsException ife=new InsufficientFundsException("Your balance is low for this Withdraw");
    		throw ife;
    	}
    
    }
    
}
