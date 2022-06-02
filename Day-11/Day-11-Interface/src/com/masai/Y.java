package com.masai;

public interface Y {

	 void fun();
   default void funA() {
		  System.out.println("default function of Y");
	 }
	public  static void funB() {
		  System.out.println("static function of Y");
	  }
}
