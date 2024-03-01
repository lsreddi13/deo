package com.java.encapsulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingArray {
	public static void main(String[] args) {
		/*
		 * int[] ar1 = { 11, 22, 13, 4, 5, 6 };
		 * 
		 * Arrays.sort(ar1);
		 * 
		 * System.out.println(Arrays.toString(ar1));
		 * 
		 * Collections.reverse(Arrays.asList(ar1));
		 * System.out.println(Arrays.toString(ar1));
		 */

		String[] str = { "sasi", "rahul", "kamal", "venu", "manoj", "ramesh", "geetha" };

		System.out.println(Arrays.toString(str));

		Arrays.sort(str);
		System.out.println(Arrays.toString(str));

	}
}
