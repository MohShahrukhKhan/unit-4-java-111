package com.masai;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Employee {
	public static double calculateBonus(String s) throws InvalidAgeException {
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate currDate = LocalDate.now();
			LocalDate joiningDate = LocalDate.parse(s, dtf);
			if(joiningDate.isAfter(currDate)) {
				throw new InvalidAgeException();
			}
			long experience = ChronoUnit.YEARS.between(joiningDate, currDate);
			if(experience < 1) {
				return 5000;
			}
			else if(experience < 2) {
				return 8000;
			}
			else {
				return 10000;
			}
		}
		catch(InvalidAgeException iae) {
			throw new InvalidAgeException("Age should not be in future");
		}
		catch(DateTimeParseException dtpe) {
			throw new InvalidAgeException("Please pass the data in the correct format");
		}
	}
}
