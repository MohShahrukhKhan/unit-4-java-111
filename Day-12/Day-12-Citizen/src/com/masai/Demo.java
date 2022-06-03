package com.masai;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		if(Pattern.matches("[a-zA-Z]{3,8}", name)&&Pattern.matches("\\d{12}", aadharCard)) {
			if((Pattern.matches("[7869]{1}\\d{9}", mobileNum))){
				
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=sc.next() ;
		
		System.out.println("Enter the Moblie Number");
		String mobileNum=sc.next() ;
		
		System.out.println("Enter You Aadhar Number");
		String aadharCard=sc.next() ;
		Demo d1=new Demo();
		if(d1.validate(name,mobileNum,aadharCard)) {
			Citizen citizen=new Citizen();
			citizen.setName(name);
			citizen.setMobileNumber(mobileNum);
			citizen.setAadharNumber(aadharCard);
			
			System.out.println("Citizen Name"+" "+citizen.getName());
			System.out.println("Citizen Mobile Number"+" "+citizen.getMobileNumber());
			System.out.println("Citizen Aadhar Card"+" "+citizen.getAadharNumber());
		}else {
			System.out.println("the appropriate validation error message.");
		}
	}

}
