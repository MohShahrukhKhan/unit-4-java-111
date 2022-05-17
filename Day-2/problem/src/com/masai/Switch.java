package com.masai;
import java.util.*;
public class Switch {
   public static void main(String[] args) {
	   Scanner city=new Scanner(System.in);
	   System.out.println("Enter the City Name");
	   String name=city.nextLine();
	
	   printCity(name);
	   city.close();
   }

private static void printCity(String name) {
	// TODO Auto-generated method stub
	switch(name) {
	case "Mumbai":System.out.println("Financial city");
	   break;
	case "Kolkata":System.out.println("City of Joy");
	   break;
	case "Delhi":System.out.println("Capital of the country");
	   break;
	case "Bangalore":System.out.println("Cyber City");
	   break;
	 default:System.out.println("May be Other Indian City");
	}
}
}
