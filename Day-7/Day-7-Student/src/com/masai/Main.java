package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the students details");
		System.out.println();
		Hosteller hosteller = new Hosteller();
		System.out.println("Enter Student ID: ");
		hosteller.studId = scn.nextInt();
		System.out.println("Enter Student Name: ");
		hosteller.studName = scn.next();

		System.out.println("Enter Exam Fee : ");
		hosteller.examFee = scn.nextDouble();

		System.out.println("Enter your Hostel Fee : ");
		hosteller.hostelFee = scn.nextDouble();

		hosteller.displayDetails();
	}

}
