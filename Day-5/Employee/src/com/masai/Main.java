package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Employee empoy=new Employee();
System.out.println("Enter Id");
int employeeId=input.nextInt();
System.out.println("Enter Name");
input.nextLine();
String employeeName=input.nextLine();
System.out.println("Enter Salary");
double salary=input.nextDouble();
System.out.println("Enter PF %");
int pfpercentage=input.nextInt();
empoy.setEmployeeId(employeeId);
empoy.setEmployeeName(employeeName);
empoy.setSalary(salary);
empoy.calculateNetSalary(pfpercentage);

// output

System.out.println("id :"+" "+empoy.getEmployeeId());
System.out.println("Name :"+" "+empoy.getEmployeeName());
System.out.println("Salary :"+" "+empoy.getSalary());
System.out.println("Net Salary :"+" "+empoy.getNetSalary());



	}

}
