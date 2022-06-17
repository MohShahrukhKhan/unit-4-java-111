package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"Shivam",850));
		students.add(new Student(12,"Myron",750));
		students.add(new Student(13,"Ramesh",650));
		students.add(new Student(14,"Rishi",950));
		students.add(new Student(15,"Vaibhav",750));
		
		List<Student>newList=students.stream()
		.filter(s -> s.getMarks() < 800).collect(Collectors.toList());
	System.out.println(newList);

	  }

}
