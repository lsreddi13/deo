package com.java.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] ar1 = new int[10];

		System.out.println(Arrays.toString(ar1));

		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter numerical value : ");

			ar1[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(ar1));
		
		for(int k=0; k<ar1.length; k++) {
			System.out.println(ar1[k]);
		}
		
	}

}
