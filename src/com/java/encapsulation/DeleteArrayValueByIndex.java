package com.java.encapsulation;

import java.util.Arrays;

public class DeleteArrayValueByIndex {
	public static void main(String[] args) {

		int[] ar1 = {  11, 22, 13, 4, 5, 6  };

		int[] ar2 = new int[ar1.length - 1];

		for (int i = 0, j = 0; i < ar1.length; i++) {
			if (i != 2) {
				ar2[j] = ar1[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ar2));
	}
}
