package com.masai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("start of main..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();

		String message = null;
		int num3 = num1 / num2;
		if(num3 > 10){
		message = "Welcome to Exception Handling ";
		}
		System.out.println("Message is :"+message.toUpperCase());
		
		}catch(InputMismatchException ime) {
			System.out.println("the erroe"+" "+ime.getMessage());
			
		}
		catch(ArithmeticException ae){
			System.out.println("the erroe"+" "+ae.getMessage());
			System.out.println(ae.getStackTrace());
		}catch(NullPointerException npe) {
			System.out.println("the erroe"+" "+npe.getMessage());
			System.out.println(npe.getStackTrace());
		}catch(Exception e) {
			System.out.println("the erroe"+" "+e.getMessage());
			System.out.println(e.getStackTrace());
		}
		System.out.println("end of main");
	}

}
