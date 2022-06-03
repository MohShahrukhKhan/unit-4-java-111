package com.masai;

import java.util.Scanner;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mobile().searchOutdatedModel();

	}
	void searchOutdatedModel() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the company model no: ");
		String modelNo = input.next();
		String device = "note" + modelNo;
		
		for(String i: outdatedModels) {
			if(i.equals(device)) {
				System.out.println(device + "_OUTDATED");
				break;
			}
		}
		
	}
}
