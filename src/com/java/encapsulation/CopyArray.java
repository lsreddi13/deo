package com.java.encapsulation;

import java.util.Arrays;

public class CopyArray {
	
	public static void main(String[] args) {
		int[] ar1 = { 11, 22, 13, 4, 5, 6,23,33 };
		
		//copy values from ar1 to ar2
		 int [] ar2 = ar1;
		 
		 
		//copy values from ar1 to ar3
		 int [] ar3 = new int[ar1.length];
		 
		 for (int i = 0; i < ar1.length; ++i) {
			 ar3[i] = ar1[i];
	        }
	      
		 
		 System.out.println(Arrays.toString(ar3));
		 
		//copy values from ar1 to ar4
		 int[] ar4 = ar1.clone();
		 
		 System.out.println(Arrays.toString(ar4));
	}

}
