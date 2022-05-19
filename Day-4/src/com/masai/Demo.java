package com.masai;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
		System.out.println("this is empty");
	}
	
	public Demo(String a) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("String value is:"+" "+a);
	}
	
	public Demo(int i) {
		// TODO Auto-generated constructor stub
		this("hello");
		System.out.println("Intger value is:"+" "+i);
		
	}
	
	public Demo(float num) {
		// TODO Auto-generated constructor stub
		this(10);
		System.out.println("foat value is:"+" "+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo canst=new Demo(10.45f);
	}

}
