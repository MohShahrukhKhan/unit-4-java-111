package com.masai;

import java.util.*;

public class VowelConsonant {

	
	void fun(char Char) {
		if(Character.isAlphabetic(Char)) {
			switch (Char) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(Char + " is vowel");
                break;
            default:
                System.out.println(Char + " is consonant");
        }
		}else {
			System.out.println("error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelConsonant s=new VowelConsonant();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet1");
		char a=sc.next().charAt(0);
		s.fun( a);
		System.out.println("Enter the Alphabet2");
		char A =sc.next().charAt(0);;
		s.fun( A);
		System.out.println("Enter the Alphabet3");
		char num=sc.next().charAt(0);;
		s.fun( num);
	}

}
