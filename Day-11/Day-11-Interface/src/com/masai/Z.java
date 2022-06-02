package com.masai;

public interface Z extends X,Y {
  void funZ();
  
  @Override
	default void funAA() {
		  System.out.println("default function of Z");
	 }
  
  
}
