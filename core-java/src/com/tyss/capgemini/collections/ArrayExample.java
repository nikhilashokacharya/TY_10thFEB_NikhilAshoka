package com.tyss.capgemini.collections;

public class ArrayExample {
	public static void main(String[] args) {

		int[] intArray1 = new int[6]; // This is the proper way of declaring an array.
		int[] intArray2 = { 10, 20, 30, 40, 50, 60 };

//		int intArray2[] = new int[6];  // Not the proper way of declaring an Array.

		intArray1[0] = 1;
		intArray1[1] = 2;
		intArray1[2] = 3;
		intArray1[3] = 4;
		intArray1[4] = 5;
		intArray1[5] = 6;
	
		
//		intArray1[5] = Integer.parseInt("1234");// The method parseInt returns a type of integer, hence when you give
												// any other value within a "" other than 0-9, there will a run-time
//		intArray1[5] = Integer.parseInt("wwerty"); // Exception occurred.(throws number format exception).
		for (int i = 0; i < intArray1.length; i++) {
			System.out.println("Element at intArray1 index: " + i + " = " + intArray1[i]);
		}
		
		for (int i : intArray2) {
			System.out.println(i);
		}
		
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println("Element at intArray2 index: " + i + " = " + intArray2[i]);
		}
		
		// The Below lines will throw an ArrayIndexOutOfBound Exception.
//		for (int i : intArray2) {
//			System.out.println("Element at intArray2 index: " + i + " = " + intArray2[i]);
//		}
		
		

	}
}
