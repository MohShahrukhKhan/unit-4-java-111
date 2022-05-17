package com.masai;
import java.util.*;
public class NuturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Nutural Number");
        int N=input.nextInt();
        
        nuturalNumber(N);
        
	}

	private static void nuturalNumber(int N) {
		// TODO Auto-generated method stub
		int number = (N * (N + 1)) / 2 ;
		System.out.println("Sum of Nutural Number"+" "+number);
	}

}
