package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the date of joining of the employee in dd/MM/yyyy format : ");
		String doj = input.next();
		try {
			double bonus = Employee.calculateBonus(doj);
			System.out.println("Bonus is " + bonus);
		}
		catch(InvalidAgeException iae) {
			System.out.println(iae.getMessage());
		}

	}

}
