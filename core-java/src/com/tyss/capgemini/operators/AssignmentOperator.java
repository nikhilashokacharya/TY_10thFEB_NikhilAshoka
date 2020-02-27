package com.tyss.capgemini.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int i = 10; // Assignment Operator
//		i = i + 10;
//		int j = i + 10;
		
		//Compound Assignment Operators
		System.out.println(i += 10); // i+=10---->i=i+10; 20
		System.out.println(i *= 10); // 200
		System.out.println(i -= 10); // 190
		System.out.println(i /= 10); //19
		System.out.println(i %= 10); //9
		
		

	}

}
