package com.masai;
public class CHECKWEATHER {
	
	public static void main(String[] args) {

	//Assume these can have any value:
	boolean isSnowing = false;
	boolean isRaining = false;
	double temperature = 60.0;
	if(isSnowing|isRaining|temperature<50) {
		System.out.println("let's stay home.");
	}else {
		System.out.println("Let's go out!");
	}
	//print "Let?s stay home." if its raining, snowing or
	//below 50 degrees and print "Let?s go out!" otherwise.

}
}