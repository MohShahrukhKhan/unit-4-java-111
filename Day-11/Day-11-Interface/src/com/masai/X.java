package com.masai;

public interface X {
  void funC();
  default void funAA() {
	  System.out.println("default function of X");
 }
   public static void funBA() {
	  System.out.println("static function of X");
  }
}
