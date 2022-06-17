package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student>student=new HashMap<>();
		student.put("Mumbai", new Student(12, "Ramesh", 850));
		student.put("Uttar Pradesh", new Student(12, "Vaibhav", 750));
		student.put("Delhi", new Student(16, "Shivam", 810));
		student.put("Goa", new Student(14, "Myron", 650));
		
		Set<Map.Entry<String,Student>>studentInSort=student.entrySet();
    
		for(Map.Entry<String,Student> s:studentInSort) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		
		List<Entry<String, Student>> list=new ArrayList<Entry<String, Student>>(studentInSort);
		System.out.println("########################");
		Collections.sort(list, new MarksBySort());
		for(Entry<String, Student>mapping : list){ System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); }

	}

}
