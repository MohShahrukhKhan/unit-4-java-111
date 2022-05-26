package com.masai;

import java.util.Scanner;

public class Demo {
	public static Bank getBank(String bank) {

		Bank whichBank = null;

		if (bank == "axis") {

			whichBank = new AxisBank();
			AxisBank ban = (AxisBank) whichBank;

		} else if (bank == "icici") {

			whichBank = new ICICIBank();

		}

		return whichBank;

	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	main method of Demo class by taking input from the user and
		print the Bank details by calling displayDetails() method. If the returned bank
		object is Axis bank then call the getCreditCard() method. */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Bank Name");
		String bank =input.next();
		
		
		
		
	}

}
