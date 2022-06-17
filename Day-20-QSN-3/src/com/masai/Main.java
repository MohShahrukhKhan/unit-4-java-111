package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"Shivam",850));
		students.add(new Student(12,"Myron",750));
		students.add(new Student(13,"Ramesh",650));
		students.add(new Student(14,"Rishi",950));
		students.add(new Student(15,"Vaibhav",750));

		Function<Student,Employee> f2 = (s)->{Employee e=new Employee(s.getRoll(), s.getName(), s.getMarks()*1000);
				 return e;};
		List<Employee>newList=students.stream().map(s->f2.apply(s)).collect(Collectors.toList());
		
	System.out.println(newList);

	  }

	}


