package com.masai;

public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   	// TODO Auto-generated method stub
	   byte oneS=2;
	   byte twoS=3;
	   byte threeS=3;
	   byte fourS=4;
	   byte fiveS=6;
		cricketScore(oneS,twoS,threeS,fourS,fiveS);
	  }
  
	  private static void cricketScore(byte oneS, byte twoS, byte threeS, byte fourS, byte fiveS) {
		  // TODO Auto-generated method stub
		  int total=oneS*1+twoS*2+threeS*3+fourS*4+fiveS*5;
		  System.out.println(total);
						  
	}

}
