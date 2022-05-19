package com.masai;
import java.util.*;
public class Prime {
     public static void main(String[] arge) {
    	 Scanner input=new Scanner(System.in);
    	 System.out.println("Enter the number");
    	 int number=input.nextInt();
    	primFec(number);
     }

	private static void primFec(int number) {
		// TODO Auto-generated method stub
		 for(int i=1;i<=number;i++) {
    		while(number%i==0) {
    			System.out.print(i+" ");
    			number/=i;

    	 }
	}
}
