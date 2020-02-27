package com.tyss.capgemini.collections;

import java.util.Arrays;

public class ArraysClassExample {
	public static void main(String[] args) {
		int[] intArray = { 34, 456, 21, 98, 345, 0, 476 };
		int max;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				max = intArray[i];
				if (intArray[j] > max) {
					max = intArray[j];
					intArray[j] = intArray[i];
					intArray[i] = max;
				}

			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		Arrays.sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		int[] intArray2 = new int[10];
		for (int j = 0; j < intArray.length; j++) {

			intArray2[j] = intArray[j];

		}
		intArray2[8] = 12;
		intArray2[9] = 30;
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}

		int[] intArray3 = Arrays.copyOf(intArray, 10);
		Arrays.fill(intArray3, 8, 9, 190);
		Arrays.fill(intArray3, 9, 10, (int)130.678f);
		for (int i = 0; i < intArray3.length; i++) {
			System.out.println(intArray3[i]);
		}
		
		System.out.println(intArray.equals(intArray2));
		System.out.println(Arrays.equals(intArray,intArray2));

	}
}
