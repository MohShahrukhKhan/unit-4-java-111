package com.masai;

public class ICICIBank extends Bank{
	double rateOfInterest;

	@Override
	void displayDetails() {

		System.out.println("Bank Name is : " + this.branchName);
		System.out.println("Bank IFSC is : " + this.IfscCode);
		System.out.println("Bank gives Interest rate of: " + this.rateOfInterest);

	}

}
