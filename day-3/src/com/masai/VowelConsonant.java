package com.masai;

public class VowelConsonant {

	
	void fun(char Char) {
		if(Character.isAlphabetic(Char)) {
			System.out.println(Char);
		}else {
			System.out.println("error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelConsonant s=new VowelConsonant();
		char a='a';
		s.fun( a);
		char A ='A';
		s.fun( A);
		char num=10;
		s.fun( num);
	}

}
