package com.java.encapsulation;

import java.util.Arrays;

public class SortingArray2 {

	public static void main(String[] args) {
		int[] myArray = { 11, 22, 13, 4, 5, 6 };
		int n = myArray.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (myArray[j] > myArray[j + 1]) {
					// Swap myArray[j] and myArray[j+1]
					int temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
				}
			}
		}
		
	System.out.println(Arrays.toString(myArray));

	}
}
