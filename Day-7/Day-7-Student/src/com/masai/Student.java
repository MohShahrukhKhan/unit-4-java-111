package com.masai;

public class Student {
	int studId ;
	String studName ;
	double examFee;
	
	void displayDetails() {
		System.out.println("student id :"+" "+studId);
		System.out.println("student Name :"+" "+studName);
		System.out.println("student  Fee :"+" "+examFee);
	}

	double payFee() {
		
		return this.examFee;
	};



	
}
