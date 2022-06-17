package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> arr=new ArrayList<>();
		
		arr.add("Anand Vihar");
		arr.add("Ghazipur");
		arr.add("Laxmi Nager");
		arr.add("Meerut");
		Collections.sort(arr,(String s1, String s2)->s2.compareTo(s1));

		System.out.println(arr);
	}

}
