package com.masai;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter History Student Name");
			String name=sc.next();
			
			System.out.println("Enter History Student Address");
			String address=sc.next();
			
	         HistoryStudent history=new HistoryStudent(name, address);
	         
	     	System.out.println("Enter history Marks");
			int histor=sc.nextInt();
			history.setHistoryMarks(histor);
			
			System.out.println("Enter civics Marks");
			int civics=sc.nextInt();
			history.setCivicsMarks(civics);
			
			
		
		
			System.out.println("Enter  Science Student Name");
			String name1=sc.next();
			
			System.out.println("Enter  Science Student Address");
			String address1=sc.next();
			
	         ScienceStudent science=new ScienceStudent(name1, address1);
	         
	     	System.out.println("Enter phisics Marks");
			int phisics=sc.nextInt();
			science.setPhisicsMarks(phisics);
			
			System.out.println("Enter chemistry Marks");
			int chemistry=sc.nextInt();
			science.setChemistryMarks(chemistry);
			
			System.out.println("Enter maths Marks  ");
			int maths=sc.nextInt();
			science.setMathsMarks(maths);
		
		  //print 
			
			System.out.println("History Student datail");
			
			System.out.println(history);
		
			System.out.println("Percentage"+" "+history.getPercentage());
	
			
            System.out.println("Science Student datail");
			
			System.out.println(science);
		
			System.out.println("Percentage"+" "+science.getPercentage());
	
			
			
	       }
	}


