package com.java.encapsulation;

import java.util.Arrays;

public class DemoArrays {

	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
//		int x = 10;
//		System.out.println(x);
		System.out.println(Arrays.toString(a));
		
//		
//		for(int i=0; i<5; i++) {
//			System.out.print(a[i]+", ");
//		}
//		System.out.println("");
		
		int[] b = new int[4];
		System.out.println(a.length);
		System.out.println(b.length);
		
		System.out.println(Arrays.toString(b));
		b[0] = 99;
		b[1] = 29;
		b[2] = 39;
		b[3] = 49;
		System.out.println(Arrays.toString(b));
		
	}
}
