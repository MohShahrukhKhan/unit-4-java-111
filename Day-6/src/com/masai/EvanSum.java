package com.masai;

public class EvanSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] matrix= {
    		 {1,2,3},
    		 {4,5,6},
    		 {7,8,9}
     };
     
     for(int col=0;col<matrix.length;col++) {
    	 int sum=0;
    	 for(int row=0;row<matrix[col].length;row++) {
    		 if(matrix[row][col]%2==0) {
    			 sum+=matrix[row][col];
    		 }
    
    	 }
    	 System.out.println(sum);
     }
	}

}
