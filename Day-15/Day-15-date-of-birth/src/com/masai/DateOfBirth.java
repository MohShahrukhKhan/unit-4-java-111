package com.masai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateOfBirth {
	
	static LocalDate validDate(String dob) throws InvalidDateFormat {
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate ld = LocalDate.parse(dob,dtf);
			return ld;
		}
		catch(DateTimeParseException e) {
			throw new InvalidDateFormat();
		}
	}
public static void main(String[] args) throws InvalidDateFormat {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Valid Date Of Birth in Right Formate dd-MM-yyyy");
	String dob=sc.next();
	try {
		LocalDate ld = validDate(dob);
		LocalDate currDate = LocalDate.now();
		if(currDate.isBefore(ld)) {
			System.out.println("Date should not be in future");
		}
		else {
			System.out.println("age of the user is : " + ChronoUnit.YEARS.between(ld, currDate));
		}
	 }
	 catch(InvalidDateFormat idf) {
		 System.out.println("Invalid date format");
	 }
	
}
}
