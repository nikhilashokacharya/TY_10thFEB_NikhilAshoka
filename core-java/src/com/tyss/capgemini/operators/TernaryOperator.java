package com.tyss.capgemini.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int i = 10, j = 20;

		int res = (i < j) ? (i + j) : (i - j);
		System.out.println(res);
		
		//OR
		// We can use either of the statements
		System.out.println((i < j) ? (i + j) : (i - j));
		
		System.out.println((i < j) ? ("i is less than j") : ("i is greater than j"));
	}
}
