package com.masai;

public class Student {
    int roll;
    String name;
    int marks;
    void displayStudentDetails() {
    	System.out.println("Roll is :"+" "+roll);
    	System.out.println("Name is :"+" "+name);
    	System.out.println("Marks is :"+" "+marks);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student student=new Student();
       student.roll=21;
       student.name="Moh Shahrukh Khan";
       student.marks=99;
       student.displayStudentDetails();
       Student student1=student;
       student1.roll=23;
       student1.name="Shivam";
       student1.marks=99;
       

       student1.displayStudentDetails();
      
	}

}
