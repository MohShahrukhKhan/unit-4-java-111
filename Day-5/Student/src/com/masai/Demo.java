package com.masai;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stude=new Student();
     Scanner input=new Scanner(System.in);
     int number=input.nextInt();
     double avg=0;
     String[] arr=new String[number];
     for(int i=0;i<arr.length;i++) {
    	 System.out.println("enter student name: ");
    	 String name=input.next();
			arr[i]=name;
			stude.setName(name);
			System.out.println("enter "+arr[i].toUpperCase() +" student address: ");
			stude.setAddress(input.next());
			System.out.println("enter "+arr[i].toUpperCase()  +" student marks: ");
			stude.setMarks(input.nextInt());
			System.out.println("enter "+arr[i].toUpperCase()  +" student roll: ");
			stude.setRoll(input.nextInt());
			System.out.println("Name: "+stude.getName().toUpperCase() );
			System.out.println("Address: "+stude.getAddress());
			System.out.println("Roll: "+stude.getRoll());
			System.out.println("Marks: "+stude.getMarks());
			avg+=stude.getMarks()/arr.length;
		
			System.out.println("*************************");
     }
     System.out.println("avrage marks is: "+avg);
     
	}

}
