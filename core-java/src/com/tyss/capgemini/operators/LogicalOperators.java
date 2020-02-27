package com.tyss.capgemini.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 30;

		//Logical AND
		System.out.println((i > j) && (j > k)); // 0.0=0(false)
		System.out.println((i > j) && (j < k)); // 0.1=0(false)
		System.out.println((i < j) && (j > k)); // 1.0=0(false)
		System.out.println((i < j) && (j < k)); // 1.1=1(True)
		
		System.out.println("****************************************");
		//Logical OR
		System.out.println((i > j) || (j > k)); // 0+0=0(false)
		System.out.println((i > j) || (j < k)); // 0+1=1(True)
		System.out.println((i < j) || (j > k)); // 1+0=1(True)
		System.out.println((i < j) || (j < k)); // 1+1=1(True)
		
		
		System.out.println("****************************************");

		//NOT Operator
		System.out.println(!((i > j) && (j > k))); // 0.0=0(false)--->!---->True
		System.out.println(!((i > j) && (j < k))); // 0.1=0(false)--->!---->True
		System.out.println(!((i < j) && (j > k))); // 1.0=0(false)--->!---->True
		System.out.println(!((i < j) && (j < k))); // 1.1=1(True)--->!---->False
		

	}

}
