package com.masai;

import java.util.Scanner;

public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		if(name.length()<9&&name.length()>2&&aadharCard.length()==12) {
			if(mobileNum.length()==10&&mobileNum.charAt(0)=='9'||mobileNum.length()==10&&mobileNum.charAt(0)=='6'||mobileNum.length()==10&&mobileNum.charAt(0)=='7'||mobileNum.length()==10&&mobileNum.charAt(0)=='8') {
				
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
