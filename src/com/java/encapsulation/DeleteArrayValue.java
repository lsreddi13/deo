package com.java.encapsulation;

import java.util.Arrays;

public class DeleteArrayValue {

	public static void main(String[] args) {
		int[] ar1 = { 1, 12, 3, 4, 2, 6 };

		int[] ar2 = new int[ar1.length - 1];

		// delete array value
		for (int i = 0, j = 0; i < ar1.length; i++) {
			if (ar1[i] != 2) {
				ar2[j] = ar1[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(ar2));

	}
}
