package com.masai;

import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
     if(number%2==1) {
    	 System.out.println(number);
     }else if(number%2==0) {
    	 int result=number-(number/10)+10;
    	 System.out.println(result);
     }else {
    	 System.out.println("error");
     }
	}

}
